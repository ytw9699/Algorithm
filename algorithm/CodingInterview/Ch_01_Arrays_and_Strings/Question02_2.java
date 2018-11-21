package Ch_01_Arrays_and_Strings;

public class Question02_2 {	
		public static boolean permutation(String s, String t) {
			//System.out.println(s.length());
			if (s.length() != t.length()) 
				return false; // Permutations must be same length
			
			int[] letters = new int[128]; // Assumption: ASCII//������ �����ʿ� �ƽ�Ű�ڵ����� �����ڵ�����
			
			for (int i = 0; i < s.length(); i++) {
				//System.out.println((int)s.charAt(i));
				letters[s.charAt(i)]++;//char�� int�� �ٲ�µ�
			}
			  
			for (int i = 0; i < t.length(); i++) {
				int c = (int) t.charAt(i);
				letters[c]--;
			    if (letters[c] < 0) {//+�� ���ش����� -�����ָ� 0�̵Ǿ� �ϴµ� 0���� �۴ٴ°� ���� ���ڿ��� �ƴѰ�
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