package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {
    @Test
    void toStringTest(){
        Restaurant sut = new Restaurant("Wemdy's", 2.6f, 1, 3);
        assertEquals("Wemdy's has 0 reviews, and a price rating of 1.", sut.toString());
    }
}
