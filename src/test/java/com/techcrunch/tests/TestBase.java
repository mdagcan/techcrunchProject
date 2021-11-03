package com.techcrunch.tests;

import com.techcrunch.pages.HomePage;
import com.techcrunch.util.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase extends Browser {
    WebDriver driver;
    HomePage homePage;

    @BeforeTest
    public void setUp() throws IOException {
        Properties testConfig = new Properties();
        testConfig.load(new FileInputStream("TestConfig.properties"));
        driver = Browser.createDriver(testConfig.getProperty("browser"));
        driver.get(testConfig.getProperty("baseUrl"));
        homePage = new HomePage(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
