package in.gov.isro;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCal {

	@Test
	public void testAdd() {
		Calc calc= new Calc();
		int result=calc.add(5,5);
		assertEquals(10, result);
	}

	
	@Test
	public void testMultiply() {
		Calc calc= new Calc();
		int result=calc.multiply(5,5);
		assertEquals(25, result);
		
	}
	
	@Test
	public void testSubtract() {
		Calc calc= new Calc();
		int result=calc.subtract(5,5);
		assertEquals(0, result);
		
	}

}
