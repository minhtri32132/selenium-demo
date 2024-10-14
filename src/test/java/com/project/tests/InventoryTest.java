package com.project.tests;

import com.project.pages.InventoryPage;
import com.project.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InventoryTest extends BaseTest{
    @DataProvider
    public static Object[][] getData() {
        return new Object[][]{
                {"standard_user","secret_sauce"}
        };
    }

    @Test(dataProvider = "getData")
    public void Tc02_Inventory_Test(String userName,String passWord) {
        InventoryPage inventoryPage = new LoginPage()
                .setTxtboxUsername(userName)
                .setTxtboxPassword(passWord)
                .setButtonLogin();

        Assert.assertEquals(inventoryPage.getLogoPage(), "Swag Labs");
        inventoryPage.addProductBackPack("backpack");
        inventoryPage.addProductBackPack("bike-light");
        Assert.assertEquals(inventoryPage.getCartBadge(),"2");
    }
}
