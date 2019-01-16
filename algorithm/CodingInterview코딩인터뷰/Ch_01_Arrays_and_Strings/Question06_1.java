package Ch_01_Arrays_and_Strings;

public class Question06_1 {	
	public static String compressBad(String str) {
		String compressedString = "";
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;
			
			//���� ���ڿ� ���繮�ڰ� ���� �ʴٸ� ���� ���ڸ� ��� ���ڿ��� �߰����ش�
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
