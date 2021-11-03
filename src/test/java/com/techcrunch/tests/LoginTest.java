package com.techcrunch.tests;

import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @Test
    public void testCase_1() {
        homePage
                .landOnSite()
                .landOnPage()
        ;
    }
    @Test
    public void testCase_2() {
        homePage
                .landOnSite()
                .listAllNews()
                .listAllAuthors()
                .numberOfAllImages()
        ;
    }
    @Test
    public void testCase_3() {
        homePage
                .landOnSite()
                .randomNewsClick()
                .getTitleAndHeader();
    }
    @Test
    public void testCase_4() {
        homePage
                .landOnSite()
                .randomNewsClick()
                .getAllLinksNewsContent()
        ;
    }

}
