package inheritance;

public class MovieReview extends Review{

    private String title;

    public MovieReview(String body, User author, int stars, String title) {
        super(body, author, stars);
        this.title = title;
    }
}
