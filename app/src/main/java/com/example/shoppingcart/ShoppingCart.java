package com.example.shoppingcart;

public class ShoppingCart {

    private int cartId;
    private String availability;

    public ShoppingCart(int cartId) {
        this.cartId = cartId;
        this.availability = "Available";
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
