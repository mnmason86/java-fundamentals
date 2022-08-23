package inheritance;

public class Review{
    public String body;
    public String author;
    public int stars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    //Getters and Setters
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    //Custom Methods
    @Override
    public String toString(){
        return (author + " gave this restaurant a review of " + stars + " stars. Here's what they had to say about this restaurant: " + body);
    }

    public void updateStars(int stars){
        this.stars = stars;
    }
}
