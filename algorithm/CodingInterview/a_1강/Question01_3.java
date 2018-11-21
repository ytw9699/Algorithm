package a_1강;

import java.util.Scanner;

public class Question01_3 {
    public static void main(String[] args) {
    	
    	Scanner StringValue = new Scanner(System.in);
    	
    	System.out.println("문자열을 입력해주세요");
    	
    	String value = StringValue.nextLine();
    			
    	boolean result = isUniqueChars(value);
    	
    	if (result) {
    		System.out.println("문자열이 중복되지 않았습니다.");
    	}else {
    		System.out.println("문자열이 중복 되었습니다.");
    	}
    }
    
    static boolean isUniqueChars(String str) {
    	//문자열 내의 각 문자를 다른 모든 문자와 비교(아스키,유니코드문자열 모두)

    	String[] strings = str.split("");//스트링값 받아서 배열로 나눠주고
        
        //System.out.println(Arrays.toString(strings));

        for(int i=0; i<strings.length-1; i++) {
          for(int j=i+1; j<strings.length; j++ )
        	if(strings[i].equals(strings[j])) {
                return false;//false는 중복되는것
            }
        }
        return true;//중복안됨
    }

}