package j_10000����;

import java.util.Scanner;
public class Main10809 {
	static Scanner sc;
	static String word;
	static char[] charARR ;
	
	static boolean checkAlphabet() {//�ҹ��� üũ
		for(int i=0; i< charARR.length; i++) {
		 if(charARR[i] < 'a' || charARR[i] > 'z')
		    return true;
		}
 	   return false;
    }
    public static void main(String[] args) {
    	
       sc= new Scanner(System.in);
       
       word = sc.nextLine();
       
       word = word.trim();
       
       charARR = word.toCharArray();
       
       while(word.length() > 100 || checkAlphabet() ) {//�ܾ��� ���̴� 100�� ���� �ʴ´�
    	   word = sc.nextLine();
    	   word.trim();
    	   charARR = word.toCharArray();
       }
       for(int i='a'; i<='z'; i++) {//97�� a 122�� z
    	   int output = word.indexOf(i);   //��ġ�� ��ȯ, ������ -1��ȯ
    	   System.out.print(output+" ");
       }
    }
}
