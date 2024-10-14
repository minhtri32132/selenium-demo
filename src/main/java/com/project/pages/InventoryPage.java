package com.project.pages;

import com.project.utils.PageActions;
import org.openqa.selenium.By;

public class InventoryPage {
    private static final By LOGO_PAGE= By.xpath("//*[contains(@class, 'app_logo')]");
    private static String PRODUCT_BACKPACK="add-to-cart-sauce-labs-%value%";
    private static final By CART_BADGE= By.xpath("//*[contains(@class, 'shopping_cart_badge')]");
    private static final By CART_LINK= By.xpath("//*[contains(@class,'shopping_cart_link')]");
    private CartPage cartPage;
    public InventoryPage()
    {
        cartPage = new CartPage();
    }
    public String getLogoPage()
    {
        return PageActions.getText(LOGO_PAGE);
    }
    public void addProductBackPack(String value)
    {
        String product = PRODUCT_BACKPACK.replace("%value%",value);
        PageActions.click(By.id(product));
    }
    public String getCartBadge()
    {
        return PageActions.getText(CART_BADGE);

    }
    public CartPage clickCart()
    {
        PageActions.click(CART_LINK);
        return new CartPage();
    }

}
