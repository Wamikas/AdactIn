package com.adactin.example;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class applicationBase {
    private WebDriver driver;
    private String baseUrl;

    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://adactin.com/";
        driver.get(baseUrl + "/HotelApp/");
    }
}
