package main;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumeralsConverter {

    @SuppressWarnings("serial")
	private Map<Integer, String> numberMapping = new LinkedHashMap<Integer, String>() {{
        put(1000, "M");
        put(500, "D");
        put(100, "C");
        put(50, "L");
        put(10, "X");
        put(5, "V");
        put(1, "I");
    }};

    @SuppressWarnings("serial")
	private Map<Integer, Integer> mapping = new LinkedHashMap<Integer, Integer>() {{
        put(1000, 100);
        put(500, 100);
        put(100, 10);
        put(50, 10);
        put(10, 1);
        put(5, 1);
        put(1, 1);
    }};

    public String inpConvert(int inp) {
        StringBuilder sb = new StringBuilder();
        for (Integer digit : DecimalSplitter.splitNumbers(inp)) {
            if (digit != 0) sb.append(convertDigits(digit));
        }
        return sb.toString();
    }

    public String convertDigits(int inp) {

        for (Entry<Integer, String> entry : numberMapping.entrySet()) {
            int mainNumber = (int) entry.getKey();
            int chipperDigit = mapping.get(mainNumber);

            if (inp == mainNumber) {
                return romainRepresentationOf(inp);
            } else if (inp == mainNumber - chipperDigit) {
                return appendThePrefix(mainNumber, chipperDigit);
            } else if (inp >= mainNumber * 2) {
                return appendTheSuffix(mainNumber, mainNumber, inp);
            } else if (inp >= mainNumber) {
                return appendTheSuffix(mainNumber, chipperDigit, inp);
            }
        }

        throw new RuntimeException("Sorry!Unable to convert the given integer to roman numerals");
    }

    public String appendThePrefix(int mainNumber, int chipperDigit) {
        return romainRepresentationOf(chipperDigit) + romainRepresentationOf(mainNumber);
    }

    public String appendTheSuffix(int mainNumber, int suffixNumber, int inp) {
        StringBuilder sb = new StringBuilder();
        sb.append(romainRepresentationOf(mainNumber));
        for (int i = 0; i < (inp - mainNumber) / suffixNumber; i++) {
            sb.append(romainRepresentationOf(suffixNumber));
        }
        return sb.toString();
    }

    public String romainRepresentationOf(int mainNumber) {
        return numberMapping.get(mainNumber);
    }
}
