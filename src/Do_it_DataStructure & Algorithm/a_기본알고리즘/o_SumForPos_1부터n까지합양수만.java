package a_기본알고리즘;
import java.util.Scanner;
// 1, 2, …, n의 합을 구합니다(양수만 입력).
class o_SumForPos_1부터n까지합양수만 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("1부터 n까지의 합을구합니다.");

		do {
			System.out.print("n의 값：");
			n = stdIn.nextInt();
		} while (n <= 0);//do while 은 끝에 세미콜론!붙임

		int sum = 0;		// 합

		for (int i = 1; i <= n; i++) {
			sum += i;		// sum에 i를 더함
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}