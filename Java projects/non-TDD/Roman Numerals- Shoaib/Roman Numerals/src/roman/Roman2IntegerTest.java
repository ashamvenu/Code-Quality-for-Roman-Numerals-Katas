package roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class Roman2IntegerTest {
	
	@Test
	public void baseValues() {
	    assertR2I(1, "I");
	    assertR2I(5, "V");
	    assertR2I(10, "X");
	    assertR2I(50, "L");
	    assertR2I(100, "C");
	    assertR2I(500, "D");
	    assertR2I(1000, "M");
	}
	@Test
	public void additions()  {
		assertR2I(2, "II");
		assertR2I(6, "VI");
		assertR2I(8, "VIII");
		assertR2I(2888, "MMDCCCLXXXVIII");
	}
	 @Test
	public void subtractions() {
		 assertR2I(4, "IV");
		 assertR2I(9, "IX");
		 assertR2I(40, "XL");
		 assertR2I(444, "CDXLIV");
		 assertR2I(999, "CMXCIX");
	}

	private void assertR2I(int expected, String roman) {
		assertEquals(expected,RomanNumbers.R2I(roman));
	}


}
