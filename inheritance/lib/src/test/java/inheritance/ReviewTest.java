package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReviewTest {
    @Test
    void toStringTest(){
        User testUser = new User("Bob");
        Review sut = new Review("Pretty good",testUser, 4);
        System.out.println(sut.toString());
        assertTrue(sut.toString().equals("Bob gave this restaurant a review of 4 " +
                "stars. Here's what they had to say about this business: Pretty " +
                "good"));
    }
}
