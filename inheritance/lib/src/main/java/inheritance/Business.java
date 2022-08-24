package inheritance;

import java.util.ArrayList;

public class Business {
    public String name;
    public ArrayList<Review> reviews;
    public float starRating;
    public String price;
    public int reviewItems = 0;

    public Business(String name, String price) {
        this.name = name;
        this.price = price;
        reviews = new ArrayList<>();

    }
    public int getReviewItems(){
        return reviewItems;
    }
    public String getName(){
        return name;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }
    public float getStarRating(){
        float ratingSum = 0.0f;
        for(Review r : this.reviews){
            ratingSum += r.getStarRating();
        }
        if (this.reviews.size() == 0){
            return 0.0f;
        } else {
            return ratingSum/this.reviews.size();
        }
    }
    public void addReview(Review review){
        if(!reviews.contains(review)){
            reviews.add(review);
            reviewItems++;
        }
    }
    @Override
    public String toString(){
        return "Business Name: " + name + ", Price: " + price + ", Rating: " + getStarRating();
    }
}
