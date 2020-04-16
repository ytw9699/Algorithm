package Ch_01_Arrays_and_Strings;

public class Question05_1 {

	public static boolean oneEditReplace(String s1, String s2) {
		boolean foundDifference = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundDifference) {
					return false;
				}
				foundDifference = true;//단 한차례의 true만 나와야함//하나만 교체되야함
			}
		}
		return true;
	}
	//s1에 문자하나를 삽입해서 s2를만들수있는지 확인//삭제는 반대로 삽입으로 대신해도됨
	public static boolean oneEditInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {//2개이상 다른문자를 가지고있는지확인
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
			System.out.println(a + ", " + b + " (true) "+" 문자열을 같게 하기 위한 편집의 횟수가 1회 이하입니다"); 
		}else {
			System.out.println(a + ", " + b + " (false) "+" 문자열을 같게 하기 위한 편집의 횟수가 2회 이상입니다");
		}
	}

}
