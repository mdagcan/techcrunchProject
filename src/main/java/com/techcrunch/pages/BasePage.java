package com.techcrunch.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class BasePage {
    WebDriver driver;
    Random random = new Random();

    public BasePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    //==================PAGE FACTORY==================//

    @FindBy(xpath = "//article[@class='post-block post-block--image post-block--unread']")
    List<WebElement> allLatestNews;

    @FindBy(xpath = "//article[@class='post-block post-block--image post-block--unread']//*[@class='river-byline__authors']")
    List<WebElement> allAuthorNames;

    @FindBy(xpath = "//article[@class='post-block post-block--image post-block--unread']//footer[@class='post-block__footer']")
    List<WebElement> allNewsImages;

    @FindBy(css = ".article__title")
    WebElement articleTitle;

    @FindBy(xpath = "//div[@class='article-content']/p/*[@href]")
    List<WebElement> allLinksNewsContent;














}