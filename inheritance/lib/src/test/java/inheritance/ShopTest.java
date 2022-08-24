package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShopTest {
    @Test
    void toStringTest(){
        Shop sut = new Shop("Peer Won", "Meh", "$$$");
        System.out.println(sut.toString());
        assertTrue(sut.toString().equals("Shop Name: Peer Won, Description: Meh, " +
                "Price: $$$"));
    }
    @Test
    void constructorTest(){
        Shop sut = new Shop("Narnes & Boble", "I just love books so much", "$");
        assertTrue(sut.getPrice().equals("$"));
        assertTrue(sut.getDescription().equals("I just love books so much"));
        assertTrue(sut.getName().equals("Narnes & Boble"));
    }
}
