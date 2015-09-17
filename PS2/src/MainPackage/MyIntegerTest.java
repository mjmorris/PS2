package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyIntegerTest {
	
	private static MyInteger myIntEven;
	private static MyInteger myIntOdd;
	private static MyInteger myIntPrime;

	@Test
	public void testIsEven() {
		MyInteger myIntEven = new MyInteger(2);
		
		assertTrue(myIntEven.isEven() == true);
	}
	
	@Test
	public void testIsOdd() {
		MyInteger myIntOdd = new MyInteger(15);
		
		assertTrue(myIntOdd.isOdd() == true);
	}
	
	@Test
	public void testIsPrime() {
		MyInteger myIntPrime = new MyInteger(3);
		
		assertTrue(myIntPrime.isPrime() == true);
	}
	
	@Test
	public void testparseInt() {
		char[] a = {'1', '5', '7', '8'};
		
		assertEquals(MyInteger.parseInt(a),1578);
	}
	
	@Test
	public void testparseIntx() {
		String s = "1578";
		
		assertEquals(MyInteger.parseInt(s),1578);
	}

}
