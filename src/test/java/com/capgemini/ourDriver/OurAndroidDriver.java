package com.capgemini.ourDriver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;

import java.net.URL;

/**
 * Created by dlammers on 2/27/2017.
 */
public class OurAndroidDriver extends AndroidDriver {

    static OurAndroidDriver driver;

    private OurAndroidDriver(URL url, Capabilities desiredCapabilities) {
        super(desiredCapabilities);
    }

    public static OurAndroidDriver getDriver(URL url, Capabilities desiredCapabilities) {
        if (driver == null) {
            driver = new OurAndroidDriver(url, desiredCapabilities);
        } else if (driver.getSessionId() == null) {
            driver = new OurAndroidDriver(url, desiredCapabilities);
        }
        return driver;

    }


}
