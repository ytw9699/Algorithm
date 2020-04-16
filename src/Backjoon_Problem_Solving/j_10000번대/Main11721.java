package j_10000번대;

import java.util.Scanner;
public class Main11721 {
    public static void main(String[] args) {
    	
       Scanner sc= new Scanner(System.in);
       
       String Order = sc.nextLine();
       
       String a = null;
       int input = 10;
       int length = Order.length();
       
       if(length > 0 && length <101) {
       for(int i=0; i<length; i+=input) {
    	   if(i+input < length) {
    		   a = Order.substring(i,i+input); 
    	   }
    	   else {
    		    a = Order.substring(i,length); 
    	   }
    	   System.out.println(a);
       }
       }
    }
}
