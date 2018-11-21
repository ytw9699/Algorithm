package Ch_01_Arrays_and_Strings;
//순열관계란?두 문자열의 길이가 같고, 순서만 다른거 , 공백도 문자하나로 취급 길이에 포함되고, 대문자도 구분한다
public class Question02_1 {	
	
	public static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) 
			return false;
		
		return sort(s).equals(sort(t));
	}	
	
	public static void main(String[] args) {
		String[][] pairs = {{"ab", "ab"}, {"bc", "cb"}, {"ab", "ac"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
	
}