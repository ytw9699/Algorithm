package b_recursive;
public class b_03_FibonacciFunc 
{
	static int Fibo(int n) 
	{
		if(n==1)//������ 1��° ��ġ�� ���� 0�� ��ȯ
			return 0;
		else if(n==2)//������ 2��° ��ġ�� ���� 1�� ��ȯ
			return 1;
		else//3��° �̻� n��° ���ʹ� n-1��°+n-2��°�� ���� ���� ��ȯ �Ѵ�.
			return Fibo(n-1)+Fibo(n-2);//�ڱ��ڽ��� �ٽ� ȣ��
	}
		public static void main(String[] args) 
		{
			int i;
			for(i=1; i<7; i++)
				System.out.printf("%d ", Fibo(i));
		}
}
	
	



	
	
