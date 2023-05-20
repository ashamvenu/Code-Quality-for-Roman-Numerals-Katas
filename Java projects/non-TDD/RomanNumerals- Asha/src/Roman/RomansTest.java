package Roman;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class RomansTest{
	
	private static List<TestCase> tests = new ArrayList<TestCase>();
	
	private static void test(int IntNum, String RomanNum) {
		tests.add(new TestCase(IntNum, RomanNum));
	}
	
	@Ignore
	private static class TestCase{
		public int IntNum;
		public String RomanNum;
		
		public TestCase(int IntNum, String RomanNum) {
			this.IntNum = IntNum;
			this.RomanNum = RomanNum;
		}
	}
	
	@Test
	public void testInt() {
		
		test(1, "I");
		test(2, "II");
		test(3, "III");
		test(4, "IV");
		test(5, "V");
		test(6, "VI");
		test(7, "VII");
		test(8, "VIII");
		test(9, "IX");
		test(11, "XI");
		test(12, "XII");
		test(13, "XIII");
		test(14, "XIV");
		test(15, "XV");
		test(20, "XX");
		test(30, "XXX");
		
		for (TestCase test: tests) {
			
			assertEquals(IntegerToRoman.Int(test.IntNum), test.RomanNum);
		}
		
	}
	
	@Test
	public void testInt1() {
		
		test(16, "XVI");
		test(17, "XVII");
		test(18, "XVIII");
		test(19, "XIX");
		test(21, "XXI");
		test(31, "XXXI");
		/**Failure**/
		//test(50, "L");
		//test(40, "XL");
		//test(10, "X");
		//test(100, "C");
		//test(150, "CL");
		//test(200, "CC");
		//test(300, "CC");
		//test(400, "CD");
		//test(500, "D");
		//test(600, "DC");
		//test(700, "DCC");
		//test(800, "DCCC");
		//test(900, "CM");
		//test(1000, "M");
		
		for (TestCase test: tests) {
			
			assertEquals(IntegerToRoman.Int(test.IntNum), test.RomanNum);
		}
	}
}
