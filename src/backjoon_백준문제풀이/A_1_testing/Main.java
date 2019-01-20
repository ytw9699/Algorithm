package A_1_testing;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	
       Scanner sc= new Scanner(System.in);
       
       String first = sc.nextLine();
       
       String second[] = first.split(" ");
       
       while(second[0].equals(second[1]) || second[0].length() != 3 || second[1].length() != 3 || second[0].contains("0") || second[1].contains("0")) {
    	   first = sc.nextLine();
    	   second = first.split(" ");
       }//두수가 같거나 3자리수가 아닐경우 또는 0이 포함될경우 다시 반복한다.
     
       String output1[] = second[0].split("");
       String finals1= "";
       
       for(int i=output1.length-1; i>=0; i--) {
    	   finals1=finals1+output1[i];
       }
       
       String output2[] = second[1].split("");
       String finals2= "";
       
       for(int i=output2.length-1; i>=0; i--) {
    	   finals2=finals2+output2[i];
       }
       
        int front = Integer.parseInt(finals1);
        int rear  = Integer.parseInt(finals2);
        
        if(front > rear) {//큰것을 출력하자
        	System.out.println(front);
		}
		else {
			System.out.println(rear);//큰것을 출력하자
		}
    }
}
