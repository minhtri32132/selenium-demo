package com.project.pages;

import com.project.utils.PageActions;
import org.openqa.selenium.By;

public class CartPage {
    private static final String PRODUCT_NAME = "//*[contains(text(), '%value%')]";
    public String getProductName(String value)
    {
        String product = PRODUCT_NAME.replace("%value%",value);
        return PageActions.getText(By.xpath(product));
    }
}
