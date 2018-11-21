package Ch_01_Arrays_and_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Question01_2 {
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
    
    static boolean isUniqueChars(String str) {  //���ķ� Ǫ�� ���(�ƽ�Ű,�����ڵ幮�ڿ� ���)

    	String[] strings = str.split("");//��Ʈ���� �޾Ƽ� �迭�� �����ְ�
        
        //System.out.println(Arrays.toString(strings));
        
        Arrays.sort(strings);//��Ʈ�� �迭�� �������� ����
        
        //System.out.println(Arrays.toString(strings));

        for(int i=0; i<strings.length-1; i++) {//���ĵȰ��� �������� ������ ���ؼ� �ߺ����� Ȯ��
            if(strings[i].equals(strings[i+1])) {
                return false;//false�� �ߺ��Ǵ°�
            }
        }
        return true;//�ߺ��ȵ�
    }

}