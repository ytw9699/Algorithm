package Ch_01_Arrays_and_Strings;

public class Question09_1 {
	public static boolean isSubstring(String big, String small) {
		if (big.indexOf(small) >= 0) {//0보다 크다는건 big안에 small이 있다는거
			//System.out.println(big.indexOf(small));//big에서 small이 시작하는 인덱스 위치를 알려줌
			return true;
		} else {
			return false;
		}
	}
	public static boolean isRotation(String s1, String s2) {
	    int len = s1.length();
	    
	    if (len == s2.length() && len > 0) { //s1과 s2의 길이가 같고 빈문자열이 아닌지 확인
	    	
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
				System.out.println(s2 + "는 " + s1 + "을 회전시킨 결과입니다.");
			}
			else
				System.out.println(s2 + "는 " + s1 + "을 회전시킨 결과가 아닙니다.");
				
		}
	}

}
