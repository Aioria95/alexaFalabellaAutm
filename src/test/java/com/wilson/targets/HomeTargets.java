package com.wilson.targets;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeTargets {
    public static Target SEARCH_PRODUCT_INPUT = Target.the("Search product input").located(By.xpath("//input[@id='testId-SearchBar-Input']"));
    public static Target FIRST_OPTION_RESULT = Target.the("First option in search result").located(By.xpath("//body[1]/div[1]/header[1]/div[2]/div[1]/div[3]/div[3]/section[1]/ul[1]/li[1]/a[1]"));
    public static Target FIRST_PRODUCT_RESULT = Target.the("First product result").located(By.xpath("//div[@id='testId-searchResults']//div[1]//a[1]"));
    public static Target PURCHASE_BUTTON_PRODUCT = Target.the("Button to add product to cart").located(By.xpath("//div[@id='buttonForCustomers']"));
    public static final Target NEXT_PICTURE_PRODUCT = Target.the("Accept offers Button").located(By.xpath("//button[@id='testId-ImageGalleryControlButton-right']"));
    public static final Target GO_CART_BUTTON = Target.the("Accept offers Button").located(By.xpath("//a[@id='linkButton']"));
    public static final Target CLOSE_BUTTON = Target.the("Accept offers Button").located(By.xpath("//div[5]//div[2]//button[1]"));
}