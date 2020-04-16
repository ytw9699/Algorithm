package j_10000번대;

import java.util.Scanner;
public class Main11720 {
    public static void main(String[] args) {
       
       int output = 0;
    	
       Scanner sc= new Scanner(System.in);
       
       int count = sc.nextInt();
       
       sc.nextLine();
       
       String Order = sc.nextLine();
       
       String[] outputARR = Order.split("");
       
       for(int i=0; i<outputARR.length; i++) {
    	   output = output + Integer.parseInt(outputARR[i]);
       }
       System.out.println(output);
    }
}
