package com.capgemini.ourDriver;

import cucumber.api.java.After;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class TearDown {

    private AndroidDriver driver;

    public TearDown() throws MalformedURLException {
        this.driver = DriverFactory.getAndroidDriver();
    }

    @After
    public void afterScenario() {
        driver.closeApp();
        driver.close();
        driver.quit();
    }
}
