package service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestCalcService {
	
	@Test
	public void test_addNumbers_positive_input() {
		CalcService service = new CalcService();
		
		int a = 10;
		int b = 20;
		int result = service.addNumbers(a, b);
		
		assertEquals(30, result);
		assertNotEquals(-30, result);

	}
	
	@Test
	public void test_addNumbers_negative_input() {
		CalcService service = new CalcService();
		
		int a = -10;
		int b = -20;
		int result = service.addNumbers(a, b);
		
		assertEquals(-30, result);
	}
}
