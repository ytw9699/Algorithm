package b_recursive;
public class b_03_FibonacciFunc 
{
	static int Fibo(int n) 
	{
		if(n==1)//수열의 1번째 위치의 값은 0을 반환
			return 0;
		else if(n==2)//수열의 2번째 위치의 값은 1을 반환
			return 1;
		else//3번째 이상 n번째 부터는 n-1번째+n-2번째의 값의 합을 반환 한다.
			return Fibo(n-1)+Fibo(n-2);//자기자신을 다시 호출
	}
		public static void main(String[] args) 
		{
			int i;
			for(i=1; i<7; i++)
				System.out.printf("%d ", Fibo(i));
		}
}
	
	



	
	
