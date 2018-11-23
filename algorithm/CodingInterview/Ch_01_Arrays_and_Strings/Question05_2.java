package Ch_01_Arrays_and_Strings;

public class Question05_2 {	
public static boolean oneEditAway(String first, String second) {
		//����üũ
		if (Math.abs(first.length() - second.length()) > 1) {
			return false;
		}
		//���̰� ª�� ���ڿ��� �� ���ڿ� ã��
		String s1 = first.length() < second.length() ? first : second;//ª����
	
		String s2 = first.length() < second.length() ? second : first;//���
		
		//System.out.println(3 < 3 ? 1 : 2);
		
		int index1 = 0;
		int index2 = 0;
		boolean foundDifference = false;
		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				//�ݵ�� ù��°�� �ٸ� ���ڿ��� �Ѵ�
				if (foundDifference) 
				return false;
				
				foundDifference = true;
				
				if (s1.length() == s2.length()) { // ��ü�ǰ�� ª�����ڿ� ����
					index1++;
				}
			} else {
				index1++; // �����ϴٸ� ª�� ���ڿ��� �����͸� ����
			}
			index2++; // �乮�ڿ��� �����ʹ� ������ ����
		}
		return true;
	}
	public static void main(String[] args) {
		//System.out.println(Math.abs(-2));//���밪 ���ϱ�
		String a = "ale";
		String b = "pale";
		boolean isOneEdit1 = oneEditAway(a, b);
		System.out.println(a + ", " + b + ": " + isOneEdit1);

		String c = "pale";
		String d = "pkle";
		boolean isOneEdit2 = oneEditAway(c, d);
		System.out.println(c + ", " + d + ": " + isOneEdit2);
	}

}
