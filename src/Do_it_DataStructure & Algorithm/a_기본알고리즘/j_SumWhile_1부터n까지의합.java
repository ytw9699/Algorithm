﻿package a_기본알고리즘;
import java.util.Scanner;
// 1, 2, …, n의 합을 구합니다.
class j_SumWhile_1부터n까지의합 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을구합니다.");
		
 		System.out.print("n의 정수 값을 입력하세요：");
 		
		int n = stdIn.nextInt();

		int sum = 0;				// 합
		int i = 1;

		while (i <= n) {			// i가 n 이하면 반복합니다.
			sum += i;				// sum에 i를 더합니다.
			i++;					// i 값을 1만큼 증가시킵니다.
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		System.out.println("i의 값은 " + i + "가(이) 되었습니다.");
	}
}