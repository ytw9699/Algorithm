package Ch_01_Arrays_and_Strings;
//���������?�� ���ڿ��� ���̰� ����, ������ �ٸ��� , ���鵵 �����ϳ��� ��� ���̿� ���Եǰ�, �빮�ڵ� �����Ѵ�
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