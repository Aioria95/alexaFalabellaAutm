package com.wilson.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ShadowDOMUtils {

    public static WebElement getShadowRootElement(WebElement hostElement, Actor actor) {
        return (WebElement) ((JavascriptExecutor) actor.usingAbilityTo(BrowseTheWeb.class).getDriver())
                .executeScript("return arguments[0].shadowRoot", hostElement);
    }

    public static WebElement getShadowElement(WebElement hostElement, String cssSelector, Actor actor) {
        WebElement shadowRoot = getShadowRootElement(hostElement, actor);
        return (WebElement) ((JavascriptExecutor) actor.usingAbilityTo(BrowseTheWeb.class).getDriver())
                .executeScript("return arguments[0].querySelector(arguments[1])", shadowRoot, cssSelector);
    }
}