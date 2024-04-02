import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalciTest{
	@Test
	public void testAdd() {
		CalciApp calciObj =new CalciApp();
		int addition = calciObj.add(4, 6);
		assertEquals(10, addition);	
	}
	@Test
	public void testSub() {
		CalciApp calciObj =new CalciApp();
		int subtraction = calciObj.add(8, 4);
		assertEquals(4, subtraction);	
	}
	@Test
	public void testMul() {
		CalciApp calciObj =new CalciApp();
		int multiplication = calciObj.add(4, 8);
		assertEquals(32, multiplication);	
	}
	@Test
	public void testDiv() {
		CalciApp calciObj =new CalciApp();
		int division = calciObj.add(10, 2);
		assertEquals(5, division);	
	}	
}