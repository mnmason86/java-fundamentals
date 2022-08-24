package inheritance;

public class Review{
    private Business business;
    private String body;
    private User author;
    private int stars;

    public Review(String body, User author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    // Custom Methods
    @Override
    public String toString(){
        return (author.getName() + " gave" + business + " a review of " + stars + " stars. " +
                "Here's what they had to say about this business: " + body);
    }
    public void updateStars(int stars){
        this.stars = stars;
    }


    //Getters and Setters

    public int getStarRating() {
        return this.stars;
    }

    public String getBody(){
        return this.body; }

    public User getAuthor() {
        return this.author; };

    public Business getBusiness(){
        return this.business;
    }

    public void setBusiness(Business business){
        this.business = business;
    }
}
