package co.amdocs;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RpncalculatorTest {

	@Test
	public void addition() {
	RPNCalculator calculator =new RPNCalculator();
	double actual =calculator.solve("3 3 +");
	double expected =6;
	assertEquals(expected,actual,0.01);
    }
	@Test
	public void subtraction() {
		RPNCalculator calculator =new RPNCalculator();
		double actual =calculator.solve("6 3 -");
		double expected =3;
		assertEquals(expected,actual,0.01);
		
		}
	
	
}
