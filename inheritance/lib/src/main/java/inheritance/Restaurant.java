package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private ArrayList<Review> allReviews;
    private int numReviews;
    private String price;
    private float starRating;

    // Constructor

    public Restaurant(String name, ArrayList<Review> allReviews, String price,
                      float starRating) {
        this.name = name;
        this.price = price;
        this.starRating = starRating;
    }
    // Custom Methods

    public String toString(){
        return (name + " has a rating of " + starRating + " and a price rating of " + price);
    }

    public void addReview(Review newReview){
        if(!allReviews.contains(newReview)) {
            allReviews.add(newReview);
            numReviews++;
        }
    }
    public float updateRating(Restaurant restaurant){
        int reviewTotal = 0;
        int reviewCount = restaurant.allReviews.size();
        for(Review rev: restaurant.allReviews){
            reviewTotal += rev.getStars();
        };
        float starRating = (reviewTotal/reviewCount);
        starRating = restaurant.starRating;
        return starRating;
    }


   //Getters and Setters

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Review> getAllReviews() {
        return allReviews;
    }
    public void setAllReviews(ArrayList<Review> allReviews) {
        this.allReviews = allReviews;
    }
    public String getPrice() {
        return this.price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public float getStarRating() {
        return starRating;
    }
    public void setStarRating(float starRating) {
        this.starRating = starRating;
    }
}
