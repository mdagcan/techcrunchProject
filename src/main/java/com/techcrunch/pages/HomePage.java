package com.techcrunch.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public MethodPage landOnSite() {
        return new MethodPage(driver);
    }
}
