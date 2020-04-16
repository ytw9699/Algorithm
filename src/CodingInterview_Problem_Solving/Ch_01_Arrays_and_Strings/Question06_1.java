package Ch_01_Arrays_and_Strings;

public class Question06_1 {	
	public static String compressBad(String str) {
		String compressedString = "";
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;
			
			//다음 문자와 현재문자가 같지 않다면 현재 문자를 결과 문자열에 추가해준다
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedString += "" + str.charAt(i) + countConsecutive;
				countConsecutive = 0;
			}
		}
		return compressedString.length() < str.length() ? compressedString : str;
	}
	
	public static void main(String[] args) {
		String str = "aabccccaaa";
		System.out.println(str);
		System.out.println(compressBad(str));
		
	}
}
