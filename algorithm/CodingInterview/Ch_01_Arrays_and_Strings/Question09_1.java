package Ch_01_Arrays_and_Strings;

public class Question09_1 {
	public static boolean isSubstring(String big, String small) {
		if (big.indexOf(small) >= 0) {//0���� ũ�ٴ°� big�ȿ� small�� �ִٴ°�
			//System.out.println(big.indexOf(small));//big���� small�� �����ϴ� �ε��� ��ġ�� �˷���
			return true;
		} else {
			return false;
		}
	}
	public static boolean isRotation(String s1, String s2) {
	    int len = s1.length();
	    
	    if (len == s2.length() && len > 0) { //s1�� s2�� ���̰� ���� ���ڿ��� �ƴ��� Ȯ��
	    	
	    	String s1s1 = s1 + s1;
	    	
	    	return isSubstring(s1s1, s2);
	    }
	    return false;
	}
	public static void main(String[] args) {
		
		String[][] pairs =
		{{"abcde", "deabc"}, {"abcde", "feabc"}};
		
		for (String[] pair : pairs) {
			
			String s1 = pair[0];
			String s2 = pair[1];
			
			boolean is_rotation = isRotation(s1, s2);
			
			if(is_rotation == true) {
				System.out.println(s2 + "�� " + s1 + "�� ȸ����Ų ����Դϴ�.");
			}
			else
				System.out.println(s2 + "�� " + s1 + "�� ȸ����Ų ����� �ƴմϴ�.");
				
		}
	}

}
