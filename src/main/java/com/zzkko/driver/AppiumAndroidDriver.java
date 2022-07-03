package com.zzkko.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidDriver {
    public static AppiumDriver<MobileElement> driver;

    public static AppiumAndroidDriver appium(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("noReset", "true");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "11");
            capabilities.setCapability("deviceName", "Redmi Note_9S");
            capabilities.setCapability("udid", "2a8cd20e");
            capabilities.setCapability("appActivity", "com.shein.welcome.WelcomeActivity");
            capabilities.setCapability("appPackage", "com.zzkko");

            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return new AppiumAndroidDriver();
    }
    public AppiumDriver<MobileElement> on(){
        return driver;
    }
}
