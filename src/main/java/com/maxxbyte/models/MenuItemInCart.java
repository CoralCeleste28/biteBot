package com.maxxbyte.models;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MenuItemInCart {
    private MenuItem menuItemName = null;
    private int quantity = 1;

    public MenuItemInCart(int i, String menuItemName, String s, Double aDouble, String s1, int i1) {
    }


    public MenuItem getMenuItem(){
        return menuItemName;
    }

    public int getQuantity(){
        return quantity;
    }

    public int getMenuItemId(){
        return this.menuItemName.getMenuItemId();
    }

    public void setMenuItem(MenuItem menuItem){
        this.menuItemName = menuItem;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getMenuItemTotal(){
        BigDecimal basePrice = BigDecimal.valueOf(menuItemName.getMenuItemPrice());
        BigDecimal quantity = BigDecimal.valueOf(this.quantity);

        BigDecimal subTotal = basePrice.multiply(quantity);
        BigDecimal taxes = subTotal.multiply(BigDecimal.valueOf(0.0825));

        return subTotal.add(taxes).setScale(2, RoundingMode.HALF_UP);
    }
}
