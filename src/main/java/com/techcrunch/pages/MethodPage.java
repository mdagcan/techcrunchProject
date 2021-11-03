package com.techcrunch.pages;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodPage extends BasePage{
int numberOfNews,numberOfAuthors,numberOfImages;
int startNumber = 1;
    public MethodPage(WebDriver driver) {
        super(driver);
    }

    public MethodPage landOnPage() {
        String pageURL = driver.getCurrentUrl();
        System.out.println(pageURL);
        Assert.assertTrue(pageURL.contains("techcrunch.com"));
        return new MethodPage(driver);
    }
    public MethodPage listAllNews() {
        numberOfNews = allLatestNews.size();
        System.out.println("There are " + allLatestNews.size() + " news in 'The Latest News' Section : ");
        for (WebElement eachNews:allLatestNews) {
            System.out.println(startNumber + ". News : " + eachNews.getText());
            startNumber++;
        }
        return new MethodPage(driver);
    }

    public MethodPage listAllAuthors() {
        numberOfNews = allLatestNews.size();
        numberOfAuthors = allAuthorNames.size();
        System.out.println("There are " + allAuthorNames.size() + " authors in 'The Latest News' Section : ");
        Assert.assertEquals(numberOfAuthors,numberOfNews);
        for(WebElement eachAuthor:allAuthorNames) {
            System.out.println(startNumber + ". author : " + eachAuthor.getText());
            startNumber++;
        }
        return new MethodPage(driver);
    }

    public MethodPage numberOfAllImages() {
        numberOfNews = allLatestNews.size();
        numberOfImages = allNewsImages.size();
        System.out.println("There are " + allNewsImages.size() + " images in 'The Latest News' Section");
        Assert.assertEquals(numberOfImages, numberOfNews);
        return new MethodPage(driver);
    }

    public MethodPage randomNewsClick() {
        int randomNumber = random.nextInt(allLatestNews.size());
        allLatestNews.get(randomNumber).click();
        System.out.println(randomNumber + ". news selected");
        return new MethodPage(driver);
    }

    public MethodPage getTitleAndHeader() {
        String articleTitleText = articleTitle.getText();
        String pageTitleText = driver.getTitle();
        System.out.println("Selected article's title : " + articleTitleText);
        Assert.assertTrue(pageTitleText.contains(articleTitleText));
        return new MethodPage(driver);
    }

    public MethodPage getAllLinksNewsContent() {
        System.out.println("There are " + allLinksNewsContent.size() + " links on News Content : ");
        for(WebElement eachLink:allLinksNewsContent) {
            String linkTest = eachLink.getAttribute("href");
            System.out.println(linkTest);
        }
        return new MethodPage(driver);
    }
}
