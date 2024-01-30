package com.wilson.step;

import com.wilson.tasks.SearchProduct;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.wilson.targets.HomeTargets.CART_OPTION;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductDefinition {

    @When("Search a product in the search bar")
    public void search_a_product_in_the_search_bar() {
        when(theActorInTheSpotlight()).wasAbleTo(SearchProduct.fill());
    }
    @Then("The product is visible in the shopping car detail")
    public void the_product_is_visible_in_the_shopping_car_detail() {
        Ensure.that(CART_OPTION.resolveFor(theActorInTheSpotlight()).getText());
    }
}
