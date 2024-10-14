package com.project.driver;

import com.project.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public final class Driver {


    private static WebDriver driver;
    public static void initDriver()  {
        driver = DriverFactory.getDriver(ConfigFactory.getConfig().browser());
        DriverManager.setDriver(driver);
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(), TimeUnit.SECONDS);
        DriverManager.getDriver().get(ConfigFactory.getConfig().url());
    }
    public static void quitDriver()
    {
        DriverManager.getDriver().quit();
    }
}
