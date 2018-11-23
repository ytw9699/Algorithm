package Ch_01_Arrays_and_Strings;

public class Question06_3 {	
	public static String compress(String str) {
		int finalLength = countCompression(str);
		
		if (finalLength >= str.length()) 
			return str;
		
		StringBuffer compressed = new StringBuffer(finalLength); // initialize capacity ó��ũ��
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;
			//�������ڿ� ���繮�ڰ� ���� �ʴٸ� ���� ���ڸ� ��� ���ڿ��� �߰��Ѵ�
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
			//�������ڿ� ���繮�ڰ� ���� �ʴٸ� ���̸� ������Ų��
			/* If next character is different than current, append this char to result.*/
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedLength += 1 + String.valueOf(countConsecutive).length();
				//������ ���̸� ����� 2������Ų�ٰ� ������
				//System.out.println("��"+String.valueOf(countConsecutive).length());
				//System.out.println("��"+compressedLength);
				countConsecutive = 0;
			}
		}
	//	System.out.println("���"+compressedLength);
		return compressedLength;
	}		
	
	public static void main(String[] args) {
		String str = "aaabb";
		System.out.println(str);
		System.out.println(compress(str));
	}
}
