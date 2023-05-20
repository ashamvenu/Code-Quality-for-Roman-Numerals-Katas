package roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class Roman2IntegerTest {
	
	@Test
	public void baseValues() {
	    assertRoman2Int(1, "I");
		assertRoman2Int(5, "V");
		assertRoman2Int(10, "X");
		assertRoman2Int(50, "L");
		assertRoman2Int(100, "C");
		assertRoman2Int(500, "D");
		assertRoman2Int(1000, "M");
	}
	@Test
	public void additions()  {
		assertRoman2Int(2, "II");
		assertRoman2Int(6, "VI");
		assertRoman2Int(8, "VIII");
		assertRoman2Int(2888, "MMDCCCLXXXVIII");
	}
	 @Test
	public void subtractions() {
		 assertRoman2Int(4, "IV");
		 assertRoman2Int(9, "IX");
		 assertRoman2Int(40, "XL");
		 assertRoman2Int(444, "CDXLIV");
		 assertRoman2Int(999, "CMXCIX");
	}

	private void assertRoman2Int(int expected, String roman) {
		assertEquals(expected,RomanNumbers.roman2Int(roman));
	}


}
