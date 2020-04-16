package Ch_01_Arrays_and_Strings;
//http://jeong-pro.tistory.com/85
public class Question06_2 {	
	public static String compress(String str) {
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;
			
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.length() < str.length() ? compressed.toString() : str;
	}
	
	public static void main(String[] args) {
		String str = "aabccccaaa";
		System.out.println(str);
		System.out.println(compress(str));
		
		/*StringBuilder tests = new StringBuilder();
		tests.append("aab");
		tests.append(1);
		tests.append(true);
		System.out.println(tests.toString());*/
	}
}
