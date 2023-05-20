package romannumeralkata;

import java.util.HashMap;

public class ArabicToIntegerConverter {

	public int convertArabicToInteger(String input) {

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		hmap.put("I", 1);
		hmap.put("IV", 4);
		hmap.put("V", 5);
		hmap.put("IX", 9);
		hmap.put("X", 10);
		hmap.put("XL", 40);
		hmap.put("L", 50);
		hmap.put("XC", 90);
		hmap.put("C", 100);
		hmap.put("CD", 400);
		hmap.put("D", 500);
		hmap.put("CM", 900);
		hmap.put("M", 1000);

		String stringToParse = input; //converting string to numbers
		int arabicValue = 0;

		while (stringToParse.length() > 1) {

			String targetLetter = String.valueOf(stringToParse.charAt(0));

			String nextLetter = String.valueOf(stringToParse.charAt(1));

			if (hmap.get(nextLetter) > hmap.get(targetLetter)) {

				String comboLetter = targetLetter + nextLetter;
				arabicValue += hmap.get(comboLetter);
				stringToParse = stringToParse.substring(2); 

			} else {

				arabicValue += hmap.get(targetLetter);
				stringToParse = stringToParse.substring(1); 
			}

		}

		if (stringToParse.length() == 1) {

			arabicValue += hmap.get(stringToParse);

		}

		return arabicValue;
	}
}
