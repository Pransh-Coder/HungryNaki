package com.example.hungrynaki;

public class Customer {
    private String Name;
    private String Review;




    public Customer(String name, String review) {
        Name = name;
        Review = review;
    }
    //Getter
    public String getName() {
        return Name;
    }

    public String getReview() {
        return Review;
    }
    //Setter

    public void setName(String name) {
        Name = name;
    }

    public void setReview(String review) {
        Review = review;
    }
}
