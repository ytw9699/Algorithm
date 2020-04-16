package j_10000번대;

import java.util.Scanner;
public class Main10809 {
	static Scanner sc;
	static String word;
	static char[] charARR ;
	
	static boolean checkAlphabet() {//소문자 체크
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
       
       while(word.length() > 100 || checkAlphabet() ) {//단어의 길이는 100을 넘지 않는다
    	   word = sc.nextLine();
    	   word.trim();
    	   charARR = word.toCharArray();
       }
       for(int i='a'; i<='z'; i++) {//97은 a 122은 z
    	   int output = word.indexOf(i);   //위치를 반환, 없으면 -1반환
    	   System.out.print(output+" ");
       }
    }
}
