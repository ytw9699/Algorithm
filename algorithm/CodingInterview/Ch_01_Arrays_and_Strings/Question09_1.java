package Ch_01_Arrays_and_Strings;

public class Question09_1 {
	public static boolean isSubstring(String big, String small) {
		if (big.indexOf(small) >= 0) {//6. 0���� ũ�ٴ°� big�ȿ� small�� �ִٴ°�
			//System.out.println(big.indexOf(small));//big���� small�� �����ϴ� �ε��� ��ġ�� �˷���
			return true;
		} else {// �ε��� ��ġ�� ��ã�Ƴ��� -1����
			return false;
		}
	}
	public static boolean isRotation(String s1, String s2) {
	    int len = s1.length();
	    
	    if (len == s2.length() && len > 0) { //3. s1�� s2�� ���̰� ���� ���ڿ��� �ƴ��� Ȯ��
	    	//4.��4�̰� ���ƾ� ȸ���Ѱ��̱⶧����
	    	String s1s1 = s1 + s1;//s1�� 2���� ��ġ�� s2�� �̾ȿ� ���Եȴٴ� Ư���� �����س�����..
	    	
	    	return isSubstring(s1s1, s2);//5. s2�� s1s1�� �κ� ���ڿ����� Ȯ��
	    }
	    return false;
	}
	public static void main(String[] args) {
		
		String[][] pairs =
		{{"abcde", "deabc"}, {"abcde", "edabc"}};
		
		for (String[] pair : pairs) {//1. �ݺ��� ���� 2���� ���ڿ��� �̾Ƴ���
			
			String s1 = pair[0];
			String s2 = pair[1];
			
			boolean is_rotation = isRotation(s1, s2); //2. �Ҹ����� ����
			
			if(is_rotation == true) {//8.���� ȸ�� ��� ���
				System.out.println(s2 + "�� " + s1 + "�� ȸ����Ų ����Դϴ�.");
			}
			else
				System.out.println(s2 + "�� " + s1 + "�� ȸ����Ų ����� �ƴմϴ�.");
		}
	}
}
/*���ڿ� ȸ��: 
�� ���ڿ��� �־����� s2�� s1�� ȸ����Ų ������� �Ǻ��غ���
abc de  > de abc
abc de  > ed abc 
abcde+abcde  = abcdeabcde   
�� �ȿ��� deabc�� �κй��ڿ��̴� �׷��� ȸ����Ų ����� �Ǻ��� �� �ִ�

�˰��� ����ð�
issubstring�� ����ð������� �޶�����
����ð��� O(A+B) ���̰� A�� B�� ���ڿ��̶�� �����ϸ� 
isRotation �� ����ð��� O(N) �� �ȴ�*/
