/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicslibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void testRoll() {
        //Arrange
        int diceRolls = 8;
        //Act
        int[] rollResults = Library.roll(diceRolls);
        //Assert
        assertTrue(rollResults.length == diceRolls);
    }
    @Test void testCompareDuplicates() {
        int [] compareArray = {4,3,6,8,1,0};
        int [] compareAnotherArray = {9,5,2,1,0,0,5};

        boolean testResult = Library.containsDuplicates(compareArray);
        boolean anotherTestResult = Library.containsDuplicates(compareAnotherArray);

        assertFalse(testResult = false);
        assertTrue(anotherTestResult = true);
    }
    @Test void testAverage() {

        int [] averageTest = {3,6,1,0,8,0};
        double averageResult = Library.average(averageTest);
        assertTrue(averageResult == 3);

    }

    @Test void testLowestAverage() {
        int[][] testMatrix = {{4, 2, 1}, {0, 6, 2}, {0, 2, 0}};
        int[] lowestArray = Library.lowestAverage(testMatrix);
        assertEquals(lowestArray, testMatrix[2]);
    }
}
