package A_1_testing;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	
	    Scanner sc= new Scanner(System.in);
       
	    int wordCount = sc.nextInt();//�Է� �ܾ� ����
	    
	    int output = wordCount;//�ϴ� �Է¹��� �ܾ���� ���� �׷�ܾ��� ����
	    
	    sc.nextLine();
	    
	    String words = new String();
	    
	    for(int i=0; i<wordCount; i++) {
	    	words = sc.nextLine().trim();
	    	output = output - groupCheck(words);//�׷�ܾ� üũ
	    }
	    System.out.println(output);//�׷�ܾ�� ���
    }
    
    static int groupCheck(String words) {//�׷�ܾ��� 0����, �ƴ϶�� 1����
    	
    	char temp;
    	
    	int groupWord = 0;//�ϴ� 0���ְ� �׷�ܾ�� �����ϰ� ���� 
    	
    	char[] currentWord = words.toCharArray();//���� �迭�� ��´�
    	temp = currentWord[0];
    	
    	outerLoop:
    	for(int k=1; k<currentWord.length; k++) {//�ܾ��ϳ��� ����
    		if(temp != currentWord[k]) {//�񱳸� ���� temp�� ���� �ٸ����� ���´ٸ�
    			for(int j=k+1; j<currentWord.length; j++) {//�׷�ܾ����� üũ �ݺ�
    				if(temp == currentWord[j]) {//�׷�ܾ �ƴ϶��
    					groupWord = groupWord+1;//1�� ���ϰ� ���
    					break outerLoop;//�ݺ��� 2�� ����������
    				}
    			}
    			temp=currentWord[k];//�� ���� �ٲ��ش�
    		}
    	}
	   return groupWord;//�׷�ܾ �ƴ϶�� 1��� ������ 0���
    }
}
