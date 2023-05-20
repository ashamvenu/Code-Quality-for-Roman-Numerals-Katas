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
	public static int R2I(String roman) {
			int val = addUp(roman);
			return correctSub(roman, val);

	}

	private static int correctSub(String roman, int val) {
		int res = val;
		for (String pair : SUBTRACTION_PAIRS) {
			if(roman.contains(pair)) 
				res -= 2 * valueOf(leftLetter(pair));	
		}
		return res;
	}

	private static int addUp(String roman) {
		int val= 0; 
		for (char letter : roman.toCharArray()) {
			val += valueOf(letter);	
		}
		return val;
	}

	private static char leftLetter(String pair) {
		return pair.charAt(0);
	}

	private static int valueOf(char charAt) {
		return LETTERS.get(charAt);
	}

}
