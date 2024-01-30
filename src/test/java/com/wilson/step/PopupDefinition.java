package com.wilson.step;

import com.wilson.utils.ClickOnShadowElement;
import com.wilson.utils.ShadowDOMUtils;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import com.wilson.navigation.NavigateTo;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static com.wilson.targets.HomeTargets.CLOSE_BUTTON;

public class PopupDefinition {

    @Given("{actor} is on the main page")
    public void dave_is_on_the_main_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.HomePage());
    }

    @When("Accept best offers popup")
    public void accept_best_offers_popup() {

    }

    @Then("See confirmation notification best offers popup")
    public void see_confirmation_notification_best_offers_popup() {

    }

    @And("Close confirmation notification best offers popup")
    public void close_confirmation_notification_best_offers_popup() {

    }
}
