package a_1��;

import java.util.Arrays;
import java.util.Scanner;
//https://blog.naver.com/zozokjs/221206994617 �ƽ�Ű�� �����ڵ忡���� ����
public class Question01_1 {
    public static void main(String[] args) {
    	
    	Scanner StringValue = new Scanner(System.in);
    	
    	System.out.println("���ڿ��� �Է����ּ���");
    	
    	String value = StringValue.nextLine();
    			
    	boolean result = isUniqueChars(value);
    	
    	if (result) {
    		System.out.println("���ڿ��� �ߺ����� �ʾҽ��ϴ�.");
    	}else {
    		System.out.println("���ڿ��� �ߺ��Ǿ����ϴ�.");
    	}
    	  
    }
    static boolean isUniqueChars(String str) { //ASCII ���� 
    	
        if(str.length() > 128) 
        	return false;//false�� �ߺ��Ǵ°�
        
        boolean[] char_set = new boolean[128];//�ʱⰪ false
        
       // System.out.println(char_set[0]);//�ʱⰪ false
        
        for (int i = 0; i < str.length(); i++) {
        	
            int val = str.charAt(i);
            
            //System.out.println(val);
            
            if(char_set[val]) {//���ڰ� üũ�Ȱ��� �ƴ��� �Ǵ�
                return false; //üũ�ȰŶ�� �ߺ��Ǵ°�
            }
            char_set[val] = true;//���⼭ true�� �ִ°� �����ϳ��� �߰�üũ �ذ��°�
        }
        return true;//for���� ������ �ƹ��������ٸ� true��ȯ �ߺ��ȵ����� ����
    }

}