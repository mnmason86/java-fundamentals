package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TheaterTest {
    @Test
    void constructorTest(){
        Theater sut = new Theater("The Barn", "$$");
        assert(sut.getName().equals("The Barn"));
        assert(sut.getPrice().equals("$$"));
    }
    @Test
    void addRemoveMovieTest(){
        Theater sut = new Theater("The Barn", "$$");
        sut.addMovie("Parry Hotter");
        sut.addMovie("Parry Hotter 2");
        sut.addMovie("Miderspan");
        assert(sut.toString().equals("Theater name: The Barn, Price: $$, Rating: 0" +
                ".0, Now Showing: [Parry Hotter, Parry Hotter 2, Miderspan]"));

        sut.removeMovie("Parry Hotter 2");
        assert(sut.toString().equals("Theater name: The Barn, Price: $$, Rating: 0" +
                ".0, Now Showing: [Parry Hotter, Miderspan]"));
    }
    @Test
    void reviewTheater(){
        User user = new User("Frank");
        Theater sut = new Theater("The Barn", "$$");
        Review review = new Review("The floor was sticky", user, 3);

        sut.addReview(review);
        assert(sut.getReviewItems() == 1);
    }
}
