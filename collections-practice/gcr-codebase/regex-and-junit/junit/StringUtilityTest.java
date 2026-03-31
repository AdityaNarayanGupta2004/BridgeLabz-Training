package junit.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilityTest {
	StringUtility utility = new StringUtility();
	@Test
	public void testReverse() {
		assertEquals("olleh", utility.reverse("hello"));
		assertEquals("", utility.reverse(""));
	}
	
	@Test
	public void testpalendrome() {
		assertEquals(true, utility.isPalendrome("aabaa"));
		assertEquals(false, utility.isPalendrome("acdaa"));
	}
	@Test
	public void testUppercase() {
		assertEquals("ADITYA", utility.toUpperCase("aditya"));
	}
	
}
