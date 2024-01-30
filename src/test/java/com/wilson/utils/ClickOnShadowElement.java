package com.wilson.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnShadowElement implements Task {

    private final String cssSelector;

    public ClickOnShadowElement(String cssSelector) {
        this.cssSelector = cssSelector;
    }

    public static Performable withCssSelector(String cssSelector) {
        return instrumented(ClickOnShadowElement.class, cssSelector);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement hostElement = actor.recall("hostElement");
        WebElement shadowElement = ShadowDOMUtils.getShadowElement(hostElement, cssSelector, actor);
        actor.attemptsTo(Click.on((Target) shadowElement));
    }
}
