package romannumeralkata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArabicToIntegerConverterTest {

	private ArabicToIntegerConverter testObject;

	@Before
	public void setup(){
		testObject = new ArabicToIntegerConverter();
	}
	
	@Test
	public void shouldReturn1ForI(){
		assertEquals(1, testObject.convertArabicToInteger("I"));
	}
	
	@Test
	public void shouldReturn5ForV(){
		assertEquals(5, testObject.convertArabicToInteger("V"));
	}
	
	@Test
	public void shouldReturn10ForX(){
		assertEquals(10, testObject.convertArabicToInteger("X"));
	}
	
	@Test
	public void shouldReturn50ForL(){
		assertEquals(50, testObject.convertArabicToInteger("L"));
	}
	
	@Test
	public void shouldReturn200ForC(){
		assertEquals(200, testObject.convertArabicToInteger("CC"));
	}
	
	@Test
	public void shouldReturn500ForD(){
		assertEquals(500, testObject.convertArabicToInteger("D"));
	}
	
	@Test
	public void shouldReturn1000ForM(){
		assertEquals(1000, testObject.convertArabicToInteger("M"));
	}
	
	@Test
	public void shouldReturn4ForIV(){
		assertEquals(4, testObject.convertArabicToInteger("IV"));
	}
	
	@Test
	public void shouldReturn9ForIX(){
		assertEquals(9, testObject.convertArabicToInteger("IX"));
	}
	
	@Test
	public void shouldReturn40ForXL(){
		assertEquals(40, testObject.convertArabicToInteger("XL"));
	}
	
	@Test
	public void shouldReturn90ForXC(){
		assertEquals(90, testObject.convertArabicToInteger("XC"));
	}
	
	@Test
	public void shouldReturn400ForCD(){
		assertEquals(400, testObject.convertArabicToInteger("CD"));
	}
	
	@Test
	public void shouldReturn900ForCM(){
		assertEquals(900, testObject.convertArabicToInteger("CM"));
	}
	
	@Test
	public void shouldReturn3000ForMMM(){
		assertEquals(3000, testObject.convertArabicToInteger("MMM"));
	}
	
	@Test
	public void shouldReturn300ForCCC(){
		assertEquals(300, testObject.convertArabicToInteger("CCC"));
	}
	
	@Test
	public void shouldReturn30ForXXX(){
		assertEquals(30, testObject.convertArabicToInteger("XXX"));
	}
	
	@Test
	public void shouldReturn3444ForMMMCDXLIV(){
		assertEquals(3444, testObject.convertArabicToInteger("MMMCDXLIV"));
	}
}
