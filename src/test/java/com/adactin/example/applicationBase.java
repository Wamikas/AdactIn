package com.adactin.example;

import com.thoughtworks.gauge.Step;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class applicationBase {
    private WebDriver browser;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        browser = new FirefoxDriver();
        baseUrl = "http://adactin.com/";
    }

    @Step("User must be at the login page")
    public void NavigateToHome() {
        browser.get(baseUrl + "/HotelApp/");

    }
    @After
    public void tearDown() throws Exception {
        browser.quit();
        }
    }
