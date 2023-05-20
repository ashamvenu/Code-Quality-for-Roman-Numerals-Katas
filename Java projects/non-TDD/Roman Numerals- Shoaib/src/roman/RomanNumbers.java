package roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {

	private static final Map<Character, Integer> LETTERS = new HashMap<Character, Integer>();
	
static {
	LETTERS.put('V', 5);
	LETTERS.put('I', 1);
	LETTERS.put('X', 10);
	LETTERS.put('L', 50);
	LETTERS.put('C', 100);
	LETTERS.put('D', 500);
	LETTERS.put('M', 1000);
}
private static final String[] SUBTRACTION_PAIRS = new String[] { "IV", "IX", "XL", "XC","CD","CM" };
	public static int roman2Int(String roman) {
			int value = addUpAllLetters(roman);
			return correctSubtractions(roman, value);

	}

	private static int correctSubtractions(String roman, int value) {
		int result = value;
		for (String pair : SUBTRACTION_PAIRS) {
			if(roman.contains(pair)) 
				result -= 2 * valueOf(leftLetter(pair));	
		}
		return result;
	}

	private static int addUpAllLetters(String roman) {
		int value= 0; 
		for (char letter : roman.toCharArray()) {
			value += valueOf(letter);	
		}
		return value;
	}

	private static char leftLetter(String pair) {
		return pair.charAt(0);
	}

	private static int valueOf(char charAt) {
		return LETTERS.get(charAt);
	}

}
