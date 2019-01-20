package A_1_testing;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	
       String output;
    	
       Scanner sc= new Scanner(System.in);
       
       int front = sc.nextInt();
       int rear = sc.nextInt();
       
       while(front == rear) {
    	   System.out.println("두수가 같습니다.다른값을 입력해주세요");
    	   rear = sc.nextInt();
       }
       
       String a = Integer.toString(front);
       String b = Integer.toString(rear);
    		   
       String output1[] = a.split("");
       a= "";
       for(int i=output1.length-1; i>=0; i--) {
    	   a=a+output1[i];
       }
       
       String output2[] = b.split("");
       b= "";
       for(int i=output2.length-1; i>=0; i--) {
    	   b=b+output2[i];
       }
        front = Integer.parseInt(a);
        rear  = Integer.parseInt(b);
        if(front >= rear) {
        	System.out.println(front);
		}
		else {
			System.out.println(rear);
		}
    }
}