package junit.demo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberUtilsTest {
	NumberUtils  util = new NumberUtils();
	@ParameterizedTest
	@ValueSource(ints = {2, 4, 6})
	void testEvenNumbers(int number) {
        assertTrue(util.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testOddNumbers(int number) {
        assertFalse(util.isEven(number));
    }
	
}
