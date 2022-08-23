package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReviewTest {
    @Test
    void toStringTest(){
        Review sut = new Review("This restaurant is just ok.", "Little Jimmy", 3);
        System.out.println(sut.toString());
        assertTrue(sut.toString().contains("Little Jimmy gave this restaurant a review of 3 stars."));
    }
}
