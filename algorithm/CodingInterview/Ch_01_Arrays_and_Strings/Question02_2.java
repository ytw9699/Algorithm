package Ch_01_Arrays_and_Strings;

public class Question02_2 {	
		public static boolean permutation(String s, String t) {
			//System.out.println(s.length());
			if (s.length() != t.length()) 
				return false; // Permutations must be same length
			
			int[] letters = new int[128]; // Assumption: ASCII//면접관 질문필요 아스키코드인지 유니코드인지
			
			for (int i = 0; i < s.length(); i++) {
				//System.out.println((int)s.charAt(i));
				letters[s.charAt(i)]++;//char이 int로 바뀌는듯
			}
			  
			for (int i = 0; i < t.length(); i++) {
				int c = (int) t.charAt(i);
				letters[c]--;
			    if (letters[c] < 0) {//+를 해준다음에 -를해주면 0이되야 하는데 0보다 작다는건 같은 문자열이 아닌거
			    	return false;
			    }
			}
			return true; // letters array has no negative values, and therefore no positive values either
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