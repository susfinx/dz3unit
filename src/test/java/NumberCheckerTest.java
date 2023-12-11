import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberCheckerTest {

    @Test
    public void testEvenOddNumberForEven() {
        NumberChecker checker = new NumberChecker();
        assertTrue(checker.evenOddNumber(4));
    }

    @Test
    public void testEvenOddNumberForOdd() {
        NumberChecker checker = new NumberChecker();
        assertFalse(checker.evenOddNumber(7));
    }

    @Test
    public void testEvenOddNumberForZero() {
        NumberChecker checker = new NumberChecker();
        assertTrue(checker.evenOddNumber(0));
    }

    @Test
    public void testEvenOddNumberForNegativeEven() {
        NumberChecker checker = new NumberChecker();
        assertTrue(checker.evenOddNumber(-6));
    }

    @Test
    public void testEvenOddNumberForNegativeOdd() {
        NumberChecker checker = new NumberChecker();
        assertFalse(checker.evenOddNumber(-11));
    }

    @Test
    public void testNumberInIntervalForInside() {
        NumberChecker checker = new NumberChecker();
        assertTrue(checker.numberInInterval(50));
    }

    @Test
    public void testNumberInIntervalForLowerBound() {
        NumberChecker checker = new NumberChecker();
        assertFalse(checker.numberInInterval(25));
    }

    @Test
    public void testNumberInIntervalForUpperBound() {
        NumberChecker checker = new NumberChecker();
        assertFalse(checker.numberInInterval(100));
    }

    @Test
    public void testNumberInIntervalForBelow() {
        NumberChecker checker = new NumberChecker();
        assertFalse(checker.numberInInterval(20));
    }

    @Test
    public void testNumberInIntervalForAbove() {
        NumberChecker checker = new NumberChecker();
        assertFalse(checker.numberInInterval(110));
    }
}
