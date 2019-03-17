package j_10000번대;

import java.util.Scanner;
public class Main10809_2 {
    public static void main(String[] args) {
    	
	    Scanner sc= new Scanner(System.in);
       
	    String word = sc.nextLine();
       
       word = word.trim();
       
       char[] charARR = word.toCharArray();
       
       for(int i='a'; i<='z'; i++) {//97은 a 122은 z
    	   int output = word.indexOf(i);   //위치를 반환, 없으면 -1반환
    	   System.out.print(output+" ");
       }
    }
}
