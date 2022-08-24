package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RestaurantTest {
    @Test
    void toStringTest() {
        Restaurant sut = new Restaurant("Wemdy's", "$");
        System.out.println(sut.toString());
        assertTrue(sut.toString().equals("Business Name: Wemdy's, Price: $, " +
                "Rating: 0" +
                ".0"));

    }

    @Test
    void addReviewTest() {
        User sutUser = new User("Patricia");
        Restaurant restaurant = new Restaurant("McBronald's", "$");
        Review sut = new Review("It's McBronald's, what can I say?",
                sutUser, 2);
        restaurant.addReview(sut);
        assertTrue(restaurant.getReviewItems() == 1);
    }
}
