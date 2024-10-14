package com.project.tests;

import com.project.driver.DriverManager;
import com.project.pages.CartPage;
import com.project.pages.InventoryPage;
import com.project.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CartTest extends BaseTest{
    @DataProvider
    public static Object[][] getData() {
        return new Object[][]{
                {"standard_user","secret_sauce"}
        };
    }

    @Test(dataProvider = "getData")
    public void Tc03_Cart_Test(String userName,String passWord) {
        InventoryPage inventoryPage = new LoginPage()
                .setTxtboxUsername(userName)
                .setTxtboxPassword(passWord)
                .setButtonLogin();

        inventoryPage.addProductBackPack("backpack");
        inventoryPage.addProductBackPack("bike-light");

        CartPage cartPage= inventoryPage.clickCart();
        Assert.assertEquals(cartPage.getProductName("Sauce Labs Backpack"),"Sauce Labs Backpack");
        Assert.assertEquals(cartPage.getProductName("Sauce Labs Bike Light"),"Sauce Labs Bike Light");
    }
}
