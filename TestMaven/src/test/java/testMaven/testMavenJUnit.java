package testMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class testMavenJUnit {
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testAddition() {
		int sum = testMavenClass.addition(20, 20);
		assertEquals(40, sum);
	}
	
	@Test
	public void testSubtraction() {
		int difference = testMavenClass.subtraction(20, 20);
		assertEquals(0, difference);
	}
	
	@Test
	public void testMultiplication() {
		int product = testMavenClass.multiplication(20, 20);
		assertEquals(400, product);
	}
	
	@Test
	public void testDivision() {
		int quotient = testMavenClass.division(20, 20);
		assertEquals(1, quotient);
	}

}
