package Ch_01_Arrays_and_Strings;

public class Question05_1 {

	public static boolean oneEditReplace(String s1, String s2) {
		boolean foundDifference = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundDifference) {
					return false;
				}
				foundDifference = true;//�� �������� true�� ���;���//�ϳ��� ��ü�Ǿ���
			}
		}
		return true;
	}
	//s1�� �����ϳ��� �����ؼ� s2��������ִ��� Ȯ��//������ �ݴ�� �������� ����ص���
	public static boolean oneEditInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {//2���̻� �ٸ����ڸ� �������ִ���Ȯ��
				if (index1 != index2) {
					return false;
				}		
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}	
	public static boolean oneEditAway(String first, String second) {
		if (first.length() == second.length()) {
			return oneEditReplace(first, second);
		} else if (first.length() + 1 == second.length()) {
			return oneEditInsert(first, second);
		} else if (first.length() - 1 == second.length()) {
			return oneEditInsert(second, first);
		} 
		return false;
	}
	
	public static void main(String[] args) {
		String a = "afe";
		String b = "pale";
		
		boolean isOneEdit = oneEditAway(a, b);
		//System.out.println(a.charAt(0) == a.charAt(0));
		if(isOneEdit) {
			System.out.println(a + ", " + b + " (true) "+" ���ڿ��� ���� �ϱ� ���� ������ Ƚ���� 1ȸ �����Դϴ�"); 
		}else {
			System.out.println(a + ", " + b + " (false) "+" ���ڿ��� ���� �ϱ� ���� ������ Ƚ���� 2ȸ �̻��Դϴ�");
		}
	}

}
