package b_기본자료구조;
// 1,00 이하의 소수를 열거(버전 1)
class n_PrimeNumber_100이하의_소수열거 {
	
	public static void main(String[] args) {
		int counter = 0;			// 나눗셈의 횟수

		for (int n = 2; n <= 100; n++) {
			
			int i;
			
			for (i = 2; i < n; i++) {
				counter++;
				if (n % i == 0)		// n을 i로 나누어떨어지면 소수가 아님
					break;			// 더 이상의 반복은 불필요
			}
			//System.out.println("i="+i);
			//System.out.println("n="+n);
			if (n == i) {		
				System.out.println(n);
			}
		}
		
		System.out.println("나눗셈을 수행한 횟수：" + counter);
	}
	
}