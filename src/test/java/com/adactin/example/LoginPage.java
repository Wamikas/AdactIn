package com.adactin.example;


import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class loginPage {

    private WebDriver browser;

    @Step("Login as <username> with <password>")
    public searchPage LoginSuccess(String username, String password) {
        inputCredentials(username, password);
        browser.findElement(By.id("login")).click();
        return new searchPage();
    }

    @Step("A welcome message should appear for <username>")
    public void ShouldDisplayWelcomeMsg(String username) {
        String expected = "Hello " + username + "!";
        WebElement welcomeMsg = browser.findElement(By.id("username_show"));
        String actual = welcomeMsg.getAttribute("value");
        Assert.assertEquals(actual, expected);

    }

    @Step("An error message should appear")
    public void ShouldDisplayErrorMsg() {
        String errorMsg = "Invalid Login Details";
        Assert.assertEquals(errorMsg,browser.findElement(By.cssSelector("b")).getText());
    }

    private void inputCredentials(String username, String password) {
        WebElement usernameTextbox = browser.findElement(By.id("username"));
        usernameTextbox.clear();
        usernameTextbox.sendKeys(username);
        WebElement passwordTextbox = browser.findElement(By.id("password"));
        passwordTextbox.clear();
        passwordTextbox.sendKeys(password);

    }

}