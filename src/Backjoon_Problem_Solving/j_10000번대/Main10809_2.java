package j_10000����;

import java.util.Scanner;
public class Main10809_2 {
    public static void main(String[] args) {
    	
	    Scanner sc= new Scanner(System.in);
       
	    String word = sc.nextLine();
       
       word = word.trim();
       
       char[] charARR = word.toCharArray();
       
       for(int i='a'; i<='z'; i++) {//97�� a 122�� z
    	   int output = word.indexOf(i);   //��ġ�� ��ȯ, ������ -1��ȯ
    	   System.out.print(output+" ");
       }
    }
}
