package a_1��;

import java.util.Scanner;

public class Question01_3 {
    public static void main(String[] args) {
    	
    	Scanner StringValue = new Scanner(System.in);
    	
    	System.out.println("���ڿ��� �Է����ּ���");
    	
    	String value = StringValue.nextLine();
    			
    	boolean result = isUniqueChars(value);
    	
    	if (result) {
    		System.out.println("���ڿ��� �ߺ����� �ʾҽ��ϴ�.");
    	}else {
    		System.out.println("���ڿ��� �ߺ� �Ǿ����ϴ�.");
    	}
    }
    
    static boolean isUniqueChars(String str) {
    	//���ڿ� ���� �� ���ڸ� �ٸ� ��� ���ڿ� ��(�ƽ�Ű,�����ڵ幮�ڿ� ���)

    	String[] strings = str.split("");//��Ʈ���� �޾Ƽ� �迭�� �����ְ�
        
        //System.out.println(Arrays.toString(strings));

        for(int i=0; i<strings.length-1; i++) {
          for(int j=i+1; j<strings.length; j++ )
        	if(strings[i].equals(strings[j])) {
                return false;//false�� �ߺ��Ǵ°�
            }
        }
        return true;//�ߺ��ȵ�
    }

}