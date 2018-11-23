package Ch_01_Arrays_and_Strings;

public class Question05_2 {	
public static boolean oneEditAway(String first, String second) {
		//길이체크
		if (Math.abs(first.length() - second.length()) > 1) {
			return false;
		}
		//길이가 짧은 문자열과 긴 문자열 찾기
		String s1 = first.length() < second.length() ? first : second;//짧은거
	
		String s2 = first.length() < second.length() ? second : first;//긴거
		
		//System.out.println(3 < 3 ? 1 : 2);
		
		int index1 = 0;
		int index2 = 0;
		boolean foundDifference = false;
		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				//반드시 첫번째로 다른 문자여야 한다
				if (foundDifference) 
				return false;
				
				foundDifference = true;
				
				if (s1.length() == s2.length()) { // 교체의경우 짧은문자열 증가
					index1++;
				}
			} else {
				index1++; // 동일하다면 짧은 문자열의 포인터를 증가
			}
			index2++; // 긴문자열의 포인터는 언제나 증가
		}
		return true;
	}
	public static void main(String[] args) {
		//System.out.println(Math.abs(-2));//절대값 구하기
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
