package Ch_01_Arrays_and_Strings;

public class Question01_5 {

	/* Assumes only letters a through z. */
	public static boolean isUniqueChars(String str) {
		if (str.length() > 26) { // Only 26 characters
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			
			if ((checker & (1 << val)) > 0) 
				return false;
			
			checker |= (1 << val);//1,3,7,15 왼쪽과 오른쪽을 연산한후 왼쪽에 대입
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

}
