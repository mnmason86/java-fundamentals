package inheritance;

import java.util.ArrayList;

public class User {
    private final String name;
    private final ArrayList<Review> reviews;

    public User(String name){
        this.name = name;
        this.reviews = new ArrayList<>();
    }

    public String getName(){

        return this.name;
    }

    public void addReview(Review review){

        this.reviews.add(review);
    }
}
