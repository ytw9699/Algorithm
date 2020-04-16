package Ch_01_Arrays_and_Strings;

public class Question06_3 {	
	public static String compress(String str) {
		int finalLength = countCompression(str);
		
		if (finalLength >= str.length()) 
			return str;
		
		StringBuffer compressed = new StringBuffer(finalLength); // initialize capacity 처음크기
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;
			//다음문자와 현재문자가 같지 않다면 현재 문자를 결과 문자열에 추가한다
			/* If next character is different than current, append this char to result.*/
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.toString();
	}
	
	public static int countCompression(String str) {
		int compressedLength = 0;
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;
			//다음문자와 현재문자가 같지 않다면 길이를 증가시킨다
			/* If next character is different than current, append this char to result.*/
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedLength += 1 + String.valueOf(countConsecutive).length();
				//무조건 길이를 여기는 2증가시킨다고 봐야함
				//System.out.println("일"+String.valueOf(countConsecutive).length());
				//System.out.println("이"+compressedLength);
				countConsecutive = 0;
			}
		}
	//	System.out.println("결과"+compressedLength);
		return compressedLength;
	}		
	
	public static void main(String[] args) {
		String str = "aaabb";
		System.out.println(str);
		System.out.println(compress(str));
	}
}
