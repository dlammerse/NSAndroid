package com.capgemini.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.capgemini.BrowserFactory;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

/**
 * Created by DLAMMERS on 19/4/2016.
 */
public class NS {
    WebDriver browser;

    public NS() throws MalformedURLException {
        this.browser = new BrowserFactory().createFfDriver();

    }


    @Given("^I am at www.ns.nl$")
    public void iAmAtWwwNsNl() throws Throwable {
        browser.get("https://www.ns.nl/producten/s/enkele-reis");
    }

    @And("^I clicked accept in cookie popup$")
    public void iClickedAcceptInCookiePopup() throws Throwable {
        WebElement iframe = browser.findElement(By.cssSelector(".r42CookieBar"));
        browser.switchTo().frame(iframe);
        browser.findElement(By.cssSelector(".button.accept")).click();
        browser.switchTo().defaultContent();

    }

    @When("^I choose to travel today$")
    public void iChooseToTravelToday() throws Throwable {
        browser.findElement(By.cssSelector("[for=\"Today_TravelDate\"]")).click();

    }
}