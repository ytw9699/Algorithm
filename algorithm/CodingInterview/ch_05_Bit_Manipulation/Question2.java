package ch_05_Bit_Manipulation;

public class Question2 {
	public static String printBinary(double num) {
		if (num >= 1 || num <= 0) {
			return "error";
		}
		StringBuilder binary = new StringBuilder();
		
		binary.append(".");
		
		while (num > 0) {
			if (binary.length() > 32) {
				return "error";
			}
			double r = num * 2;
			if (r >= 1) {
				binary.append(1);
				num = r - 1;
			} else {
				binary.append(0);
				num = r;
			}
		}
		return binary.toString();
	}
	public static void main(String[] args) {
		String bs = printBinary(0.75);
		System.out.println(bs);
	}
}
