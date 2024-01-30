package com.wilson.tasks;

import com.wilson.utils.Constants;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.HoverOverBy;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.wilson.targets.HomeTargets.*;
import static com.wilson.utils.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchProduct implements Task {
    @Step("{0} Add product to cart")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SEARCH_PRODUCT_INPUT, isVisible()),
                Enter.theValue(PRODUCT_NAME.getValue()).into(SEARCH_PRODUCT_INPUT),
                Click.on(FIRST_OPTION_RESULT),
                WaitUntil.the(FIRST_PRODUCT_RESULT, isVisible()),
                Click.on(FIRST_PRODUCT_RESULT),
                WaitUntil.the(PURCHASE_BUTTON_PRODUCT, isVisible()),
                Click.on(NEXT_PICTURE_PRODUCT),
                Click.on(PURCHASE_BUTTON_PRODUCT),
                WaitUntil.the(GO_CART_BUTTON, isVisible()),
                Click.on(GO_CART_BUTTON)
        );
    }

    public static SearchProduct fill() {
        return Instrumented.instanceOf(SearchProduct.class).newInstance();
    }
}
