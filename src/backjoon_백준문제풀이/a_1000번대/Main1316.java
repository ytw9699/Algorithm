package a_1000����;

import java.util.Scanner;
public class Main1316 {
    public static void main(String[] args) {
    	
	    Scanner sc= new Scanner(System.in);
       
	    int count = sc.nextInt();
	    
	    int outCount = count;
	  
	    char temp;
	    
	    sc.nextLine();
	    
	    String words[] = new String[count];
	    
	    for(int i=0; i<count; i++) {
	    	words[i] = sc.nextLine().trim();
	    }
       
	    for(int i=0; i<count; i++) {//�Է¹��� �ܾ� �� ��ŭ �ݺ�
	    	
	    	char[] charARR = words[i].toCharArray();//���� �迭�� ��´�
	    	temp = charARR[0];
	    	
	    	outerLoop:
	    	for(int k=1; k<charARR.length; k++) {//�ܾ��ϳ��� ����
	    		if(temp != charARR[k]) {//�񱳸� ���� temp�� ���� �ٸ����� ���´ٸ�
	    			for(int j=k+1; j<charARR.length; j++) {//�׷�ܾ����� üũ �ݺ�
	    				if(temp == charARR[j]) {//�׷�ܾ �ƴ϶��
	    					outCount = outCount-1;//��ü �ܾ������ -1�� �ذ���
	    					break outerLoop;//�ݺ��� 2�� ����������
	    				}
	    			}
	    			temp=charARR[k];//�� ���� �ٲ��ش�
	    		}
	    	}
	    }
	   System.out.println(outCount);//�׷�ܾ�� ���
    }
}
