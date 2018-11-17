package b_기본자료구조;
// 1,000 이하의 소수를 열거(버전 2)
class n_PrimeNumber2_개선된1000이하의소수구하기 {
	public static void main(String[] args) {
		int counter = 0;			// 나눗셈의 횟수
		int ptr = 0;				// 찾은 소수의 개수
		int[] prime = new int[500];	// 소수를 저장하는 배열

		prime[ptr++] = 2;		// 2는 소수임

		for (int n = 3; n <= 1000; n += 2) {//대상은 홀수만 4이상의 짝수는 어차피 소수아님
			int i;
			for (i = 1; i < ptr; i++) {	//이미 찾은 소수 3이상으로 로 나누어 봄 그걸로 
				//나누어봐도 충분히 소수인지 판단됨 2로나누어볼필요없는듯 왜냐면 다 홀수니까
				counter++;
				if (n % prime[i] == 0)	//나누어떨어지면 소수가 아님
					break;				//더 이상의 반복은 불필요
			}
			if (ptr == i)				//마지막까지 나누어떨어지지 않음
				prime[ptr++] = n;		//소수라고 배열에 저장
		}

		for (int i = 0; i < ptr; i++)	//찾은 ptr개의 소수를  나타냄
			System.out.println(prime[i]);

		System.out.println("나눗셈을 수행한 횟수：" + counter);//14600
		
	}
}