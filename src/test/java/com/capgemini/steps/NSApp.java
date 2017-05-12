package com.capgemini.steps;

import com.capgemini.ourDriver.DriverFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by DLAMMERS on 19/4/2016.
 */
public class NSApp {

    private AndroidDriver driver;

    public NSApp() throws MalformedURLException {
        driver = DriverFactory.getAndroidDriver();
    }

    @Given("^NS app is started$")
    public void iAmAtWwwNsNl() throws Throwable {
        driver.currentActivity().equals("nl.ns.android.activity.reisplanner.ReisplannerActivity");
    }

    @And("^I have clicked OK in time zone pop up$")
    public void iHaveClickedOKInTimeZonePopUp() throws Throwable {
            driver.findElement(By.id("android:id/button1")).click();
    }

    @And("^I travel from Amsterdam$")
    public void iTravelFromAmsterdam() throws Throwable {
        driver.findElement(By.id("nl.ns.android.activity:id/vanLocatieText")).click();
        driver.findElement(By.id("nl.ns.android.activity:id/autoCompleteText")).sendKeys("Amsterdam Centraal");
        WebElement resultList = driver.findElement(By.id("nl.ns.android.activity:id/autoSuggestResults"));
        resultList.findElement(By.className("android.widget.FrameLayout")).click();


    }

    @And("^I close the app$")
    public void iCloseTheApp() throws Throwable {
        driver.closeApp();
        driver.quit();
    }
}
