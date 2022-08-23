package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RestaurantTest {
    @Test
    void toStringTest() {
        Restaurant sut = new Restaurant("Wemdy's", null, "$$", 3);
        assertEquals("Wemdy's has a rating of 3.0 and a price rating of $$",
                sut.toString());
    }

    @Test
    void addReviewTest() {
        Restaurant sut = new Restaurant("Wemdy's", null, "$$", 3);
        Review sut2 = new Review("I have some opinions", "Person1", 4, sut);
        sut.addReview(sut2);
        assertTrue(sut2.body.equals("I have some opinions"));
    }
}
