package b_recursive;
public class b_01_Recursive 
{
	static void Recursive(int num) 
	{
		if(num <=0)//Ż������
			return;//Ż��
		
		System.out.printf("Recursive call! %d \n", num);
		Recursive(num-1);//�ڱ��ڽ��� �ٽ� ȣ��
		
	}
		public static void main(String[] args) 
		{
			Recursive(3);//���� ù��°�� ȣ��� �޼ҵ� ���� �������� ����
		}
}
