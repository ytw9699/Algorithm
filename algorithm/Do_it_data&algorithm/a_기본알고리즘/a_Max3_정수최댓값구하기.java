package a_기본알고리즘;

import java.util.Scanner;

class a_Max3_정수최댓값구하기 {// 3개의 정숫값을 입력하고 최댓값을 구합니다.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		
		System.out.print("a의 값：");	
		int a = stdIn.nextInt();//키보드에서 입력한 값중 정수값을 얻어냄
		
		System.out.print("b의 값：");	
		int b = stdIn.nextInt();
		
		System.out.print("c의 값：");	
		int c = stdIn.nextInt();
		
		int max = a;	
		
		if (b > max) 
			max = b;
		
		if (c > max) 
			max = c;

		System.out.println("최댓값은 " + max + "입니다.");
	}
}
