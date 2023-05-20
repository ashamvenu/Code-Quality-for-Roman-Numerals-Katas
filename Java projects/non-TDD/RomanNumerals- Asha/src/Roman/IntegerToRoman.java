package Roman;

import java.util.ArrayList;
import java.util.List;

public class IntegerToRoman{
	
	public static String Int(int num) {
		String result = "";
		
		for(RomanConversion conversion: conversions) {
		while (num >= conversion.IntNum) {
			result += conversion.RomanNum;
			num -= conversion.IntNum;
			}
		}
		return result;
	}
	
	private static List<RomanConversion> conversions;
	static {
		conversions = new ArrayList<RomanConversion>();
		addConversion(100, "C");
		addConversion(150, "CL");
		addConversion(200, "CC");
		addConversion(250, "CCL");
		addConversion(300, "CCC");
		addConversion(350, "CCCL");
		addConversion(400, "CD");
		addConversion(450, "CDL");
		addConversion(500, "D");
		addConversion(550, "DL");
		addConversion(600, "DC");
		addConversion(650, "DCL");
		addConversion(700, "DCC");
		addConversion(750, "DCCL");
		addConversion(800, "DCCC");
		addConversion(850, "DCCCL");
		addConversion(900, "CM");
		addConversion(950, "CML");
		addConversion(1000, "M");
		addConversion(1010, "MX");
		addConversion(1020, "MXX");
		addConversion(1030, "MXXX");
		addConversion(1040, "MXL");
		addConversion(1050, "ML");
		addConversion(1060, "MLX");
		addConversion(1070, "MLXX");
		addConversion(1080, "MLXXX");
		addConversion(1090, "MXC");
		addConversion(1100, "MC");
		addConversion(1200, "MCC");
		addConversion(1300, "MCCC");
		addConversion(1400, "MCD");
		addConversion(1500, "MD");
		addConversion(1600, "MDC");
		addConversion(1700, "MDCC");
		addConversion(1800, "MDCCC");
		addConversion(1900, "MCM");
		addConversion(1950,	"MCML");
		addConversion(1960,	"MCMLX");
		addConversion(1970,	"MCMLXX");
		addConversion(1980,	"MCMLXXX");
		addConversion(1990,	"MCMXC");
		addConversion(2000, "MM");
		addConversion(2010, "MMX");
		addConversion(2020, "MMXX");
		addConversion(2030, "MMXXX");
		addConversion(2040, "MMXL");
		addConversion(2050, "MML");
		addConversion(2060, "MMLX");
		addConversion(2070, "MMLXX");
		addConversion(2080, "MMLXXX");
		addConversion(2090, "MMXC");
		addConversion(3000, "MMM");
		addConversion(3010, "MMMX");
		addConversion(3020, "MMMXX");
		addConversion(3030, "MMMXXX");
		addConversion(3040, "MMMXL");
		addConversion(3050, "MMML");
		addConversion(3060, "MMMLX");
		addConversion(3070, "MMMLXX");
		addConversion(3080, "MMMLXXX");
		addConversion(3090, "MMMXC");
		addConversion(4000, "MMMM");
		addConversion(30, "XXX");
		addConversion(40, "XL");
		addConversion(50, "L");
		addConversion(20, "XX");
		addConversion(19, "XIX");
		addConversion(18, "XVIII");
		addConversion(17, "XVII");
		addConversion(16, "XVI");
		addConversion(15, "XV");
		addConversion(14, "XIV");
		addConversion(13, "XIII");
		addConversion(12, "XII");
		addConversion(11, "XI");
		addConversion(10, "X");
		addConversion(9, "IX");
		addConversion(8, "VIII");
		addConversion(7, "VII");
		addConversion(6, "VI");
		addConversion(5, "V");
		addConversion(4, "IV");
		addConversion(1, "I");
		addConversion(2, "II");
		addConversion(3, "III");
	}
	private static void addConversion(int IntNum, String RomanNum) {
		conversions.add(new RomanConversion(IntNum, RomanNum));
	}

	private static class RomanConversion{
		public int IntNum;
		public String RomanNum;
		
		public RomanConversion(int IntNum, String RomanNum) {
			this.IntNum = IntNum;
			this.RomanNum = RomanNum;
		}
	}
}