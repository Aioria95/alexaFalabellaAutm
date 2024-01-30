package com.wilson.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebElement;

public class YourInteractions implements Interaction {

    private final WebElement hostElement;

    public YourInteractions(WebElement hostElement) {
        this.hostElement = hostElement;
    }

    public static YourInteractions onElement(WebElement hostElement) {
        return Tasks.instrumented(YourInteractions.class, hostElement);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("hostElement", hostElement);
        // Otras acciones de Screenplay aquí
        actor.attemptsTo(
                ClickOnShadowElement.withCssSelector(".airship-btn.airship-btn-accept")
        );
    }
}