package com.project.utils;

import com.project.config.ConfigFactory;
import com.project.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActions {
    private static WebElement element;

    public static void sendKeys(By by, String value) {
        element = waitUntilPresence(by);
        element.sendKeys(value);
    }

    public static void click(By by) {
        element = waitUntilPresence(by);
        element.click();
    }
    public static String getText(By by) {
        element = waitUntilPresence(by);
       return element.getText();
    }
    private static WebElement waitUntilPresence(By by) {
        WebDriverWait implicitWait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return implicitWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
