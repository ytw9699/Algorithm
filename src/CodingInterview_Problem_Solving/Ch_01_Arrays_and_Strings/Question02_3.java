package Ch_01_Arrays_and_Strings;

public class Question02_3 {	//문자열 입력값 모든 순열 구하기
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
		
	    int n = str.length();
	    
	    if (n == 0) 
	    	System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++) {
	    permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	        }
	    }
	}
		public static void main(String[] args) {
			
			permutation("abc");
			
			}
	}