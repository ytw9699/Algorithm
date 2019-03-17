package j_10000¹ø´ë;

import java.util.Scanner;
public class Main11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int count = sc.nextInt();
		 for(int i=1; i<=count; i++) {
			 int a= sc.nextInt();
			 int b= sc.nextInt();
			 System.out.println("Case #"+i+": " +a+" + "+b+" = "+(a+b));
		}
	}
}
