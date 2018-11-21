package a_1강;

import java.util.Arrays;
import java.util.Scanner;
//https://blog.naver.com/zozokjs/221206994617 아스키와 유니코드에대한 설명
public class Question01_1 {
    public static void main(String[] args) {
    	
    	Scanner StringValue = new Scanner(System.in);
    	
    	System.out.println("문자열을 입력해주세요");
    	
    	String value = StringValue.nextLine();
    			
    	boolean result = isUniqueChars(value);
    	
    	if (result) {
    		System.out.println("문자열이 중복되지 않았습니다.");
    	}else {
    		System.out.println("문자열이 중복되었습니다.");
    	}
    	  
    }
    static boolean isUniqueChars(String str) { //ASCII 가정 
    	
        if(str.length() > 128) 
        	return false;//false는 중복되는것
        
        boolean[] char_set = new boolean[128];//초기값 false
        
       // System.out.println(char_set[0]);//초기값 false
        
        for (int i = 0; i < str.length(); i++) {
        	
            int val = str.charAt(i);
            
            //System.out.println(val);
            
            if(char_set[val]) {//문자가 체크된건지 아닌지 판단
                return false; //체크된거라면 중복되는것
            }
            char_set[val] = true;//여기서 true를 주는건 문자하나를 추가체크 해가는것
        }
        return true;//for문이 끝나고 아무문제없다면 true반환 중복안됨으로 끝남
    }

}