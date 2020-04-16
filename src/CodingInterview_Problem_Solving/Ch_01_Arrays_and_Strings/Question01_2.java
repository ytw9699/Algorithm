package Ch_01_Arrays_and_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Question01_2 {
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
    
    static boolean isUniqueChars(String str) {  //정렬로 푸는 방법(아스키,유니코드문자열 모두)

    	String[] strings = str.split("");//스트링값 받아서 배열로 나눠주고
        
        //System.out.println(Arrays.toString(strings));
        
        Arrays.sort(strings);//스트링 배열을 오름차순 정렬
        
        //System.out.println(Arrays.toString(strings));

        for(int i=0; i<strings.length-1; i++) {//정렬된것중 연속적인 값들을 비교해서 중복여부 확인
            if(strings[i].equals(strings[i+1])) {
                return false;//false는 중복되는것
            }
        }
        return true;//중복안됨
    }

}