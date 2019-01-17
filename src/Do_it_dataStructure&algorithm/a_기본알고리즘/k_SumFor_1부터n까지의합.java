package a_기본알고리즘;
import java.util.Scanner;
// 1, 2, …, n의 합을 구합니다.
class k_SumFor_1부터n까지의합 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을구합니다.");
		System.out.print("n의 값：");
		int n = stdIn.nextInt();

		int sum = 0;					// 합

		for (int i = 1; i <= n; i++) {
			sum += i;					// sum에 i를 더합니다.
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
	}
}