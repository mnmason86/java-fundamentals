package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private ArrayList<Review> allReviews;
    private int price;

    private float starRating;


    public Restaurant(String name, float stars, int price, float starRating) {
        this.name = name;
        this.allReviews = new ArrayList<>();
        this.price = price;
        this.starRating = starRating;
    }
    // Custom Methods

    public String toString(){
        return (name + " has " + allReviews.size() + " reviews, and a price rating of " + price + "." );
    }

    public void addReview(Review newReview){

    }



   //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStars() {
        return starRating;
    }

    public void setStars(float stars) {
        this.starRating = starRating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
