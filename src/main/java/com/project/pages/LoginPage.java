package com.project.pages;

import com.project.driver.DriverManager;
import com.project.utils.PageActions;
import org.openqa.selenium.By;

public class LoginPage {
    private static final By TXTBOX_USERNAME = By.id("user-name");
    private static final By TXTBOX_PASSWORD = By.id("password");
    private static final By BUTTON_LOGIN = By.id("login-button");

    public LoginPage setTxtboxUsername(String userName) {
        PageActions.sendKeys(TXTBOX_USERNAME, userName);
        return this;
    }

    public LoginPage setTxtboxPassword(String password) {
        PageActions.sendKeys(TXTBOX_PASSWORD, password);
        return this;

    }

    public InventoryPage setButtonLogin() {
        PageActions.click(BUTTON_LOGIN);
        return new InventoryPage();

    }
}
