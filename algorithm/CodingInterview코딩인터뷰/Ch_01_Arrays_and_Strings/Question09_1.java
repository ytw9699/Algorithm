package Ch_01_Arrays_and_Strings;

public class Question09_1 {
	public static boolean isSubstring(String big, String small) {
		if (big.indexOf(small) >= 0) {//6. 0보다 크다는건 big안에 small이 있다는거
			//System.out.println(big.indexOf(small));//big에서 small이 시작하는 인덱스 위치를 알려줌
			return true;
		} else {// 인덱스 위치를 못찾아내면 -1리턴
			return false;
		}
	}
	public static boolean isRotation(String s1, String s2) {
	    int len = s1.length();
	    
	    if (len == s2.length() && len > 0) { //3. s1과 s2의 길이가 같고 빈문자열이 아닌지 확인
	    	//4.길4이가 같아야 회전한것이기때문에
	    	String s1s1 = s1 + s1;//s1을 2개를 합치면 s2가 이안에 포함된다는 특성을 생각해내야함..
	    	
	    	return isSubstring(s1s1, s2);//5. s2가 s1s1의 부부 문자열인지 확인
	    }
	    return false;
	}
	public static void main(String[] args) {
		
		String[][] pairs =
		{{"abcde", "deabc"}, {"abcde", "edabc"}};
		
		for (String[] pair : pairs) {//1. 반복문 통해 2개의 문자열을 뽑아내고
			
			String s1 = pair[0];
			String s2 = pair[1];
			
			boolean is_rotation = isRotation(s1, s2); //2. 불린값을 얻자
			
			if(is_rotation == true) {//8.최종 회전 결과 출력
				System.out.println(s2 + "는 " + s1 + "을 회전시킨 결과입니다.");
			}
			else
				System.out.println(s2 + "는 " + s1 + "을 회전시킨 결과가 아닙니다.");
		}
	}
}
/*문자열 회전: 
두 문자열이 주어지면 s2가 s1을 회전시킨 결과인지 판별해보자
abc de  > de abc
abc de  > ed abc 
abcde+abcde  = abcdeabcde   
이 안에서 deabc는 부분문자열이다 그러면 회전시킨 결과로 판별할 수 있다

알고리즘 수행시간
issubstring의 수행시간에따라 달라진다
수행시간이 O(A+B) 길이가 A와 B인 문자열이라고 가정하면 
isRotation 의 수행시간은 O(N) 이 된다*/
