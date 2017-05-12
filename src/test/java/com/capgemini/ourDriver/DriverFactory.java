package com.capgemini.ourDriver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    static AndroidDriver driver;


    public static AndroidDriver getAndroidDriver() throws MalformedURLException {
        File appDir = new File(System.getProperty("user.dir"));
        File app = new File(appDir, "NS Reisplanner Xtra_v4.6.16_apkpure.com.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("device","Android");
        capabilities.setCapability("platformVersion", "5.1");
//        capabilities.setCapability("appWaitActivity", "nl.ns.android.activity.welcome.WelcomActivity");
        capabilities.setCapability("appWaitActivity", "nl.ns.android.activity.reisplanner.ReisplannerActivity");
        capabilities.setCapability("language", "en");
        capabilities.setCapability("noReset", "true");

        //mandatory capabilities
        capabilities.setCapability("deviceName","Android Emulator");

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = OurAndroidDriver.getDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        System.out.println("Is the app started?");
        return driver;
    }

}
