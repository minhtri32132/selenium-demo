package com.project.tests;

import com.project.pages.InventoryPage;
import com.project.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @DataProvider
    public static Object[][] getData() {
        return new Object[][]{
                {"standard_user","secret_sauce"}
        };
    }

    @Test(dataProvider = "getData")
    public void Tc01_Login_Test(String userName,String passWord) {
        InventoryPage inventoryPage = new LoginPage().setTxtboxUsername(userName)
                .setTxtboxPassword(passWord)
                .setButtonLogin();

    }
}
