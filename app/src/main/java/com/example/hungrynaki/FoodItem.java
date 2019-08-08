package com.example.hungrynaki;

public class FoodItem {
    private String foodItemName;
    private int cartImage;

    public FoodItem(String foodItemName, int cartImage) {
        this.foodItemName = foodItemName;
        this.cartImage = cartImage;
    }

    public String getFoodItemName() {
        return foodItemName;
    }

    public int getCartImage() {
        return cartImage;
    }
}
