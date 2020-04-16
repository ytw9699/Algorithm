package a_기본알고리즘;
import java.util.Scanner;
// 1, 2, …, n의 합을 구합니다(양수만 입력).
class p_Difference_01_10_2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
		System.out.print("a의 값：");
		a = stdIn.nextInt();
		
		do {
			System.out.print("b의 값：");
			b = stdIn.nextInt();
		} while (b < a);
		

		System.out.println("b-a는" +(b-a)+ "입니다.");
	}
}