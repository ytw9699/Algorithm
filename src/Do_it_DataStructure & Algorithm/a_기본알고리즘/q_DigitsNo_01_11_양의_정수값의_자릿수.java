package a_기본알고리즘;
import java.util.Scanner;
// 양의 정수값의 자릿수를 구하여 나타냄
class q_DigitsNo_01_11_양의_정수값의_자릿수 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("양의 정수값의 자릿수를 구합니다.");
		int n;
		do {
			System.out.print("정수값：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int count = 0; 			// 자릿수
		while (n > 0) {
			n /= 10; 			// n을 10으로 나눔
			count++;
		}
		System.out.println("그 수는 " + count + "자리입니다.");
	}
}