package com.capgemini.ourDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class Setup {

    private AndroidDriver driver;

    @Before
    public void beforeScenario() throws MalformedURLException {
        driver = DriverFactory.getAndroidDriver();

    }

}
