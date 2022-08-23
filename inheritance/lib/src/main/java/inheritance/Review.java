package inheritance;

public class Review{
    String body;
    public String author;
    private int stars;
    private Restaurant restaurant;

    public Review(String body, String author, int stars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        setStars(stars);
        this.restaurant = restaurant;
    }


    @Override
    public String toString(){
        return (author + " gave this restaurant a review of " + stars + " stars. Here's what they had to say about this restaurant: " + body);
    }

    //Getters and Setters

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void updateStars(int stars){
        if (stars < 0 || stars > 5){
            throw new IllegalArgumentException(stars + " is out of range. Please " +
                    "rate 1-5 stars");
        }
        setStars(stars);
    }
}
