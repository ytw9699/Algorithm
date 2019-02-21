package b_recursive;
public class b_05_HanoiTowerSolu {
							//from�� �����ִ� num���� ������ by�� ���ļ� to�� �̵� 
	static void HanoiTowerMove(int num, char from, char by, char to)
	{
		if(num==1)    // �̵��� ������ ���� 1�����
		{
			System.out.printf("����1�� %c���� %c�� �̵� \n", from, to);
		}
		else
		{   
			HanoiTowerMove(num-1, from, to, by);// 3�ܰ� �� 1�ܰ� 
			System.out.printf("����%d��(��) %c���� %c�� �̵� \n", num, from, to);// 3�ܰ� �� 2�ܰ�
			HanoiTowerMove(num-1, by, from, to);// 3�ܰ� �� 3�ܰ�
		}
	}
	public static void main(String[] args) {
		// ����A�� ���� 3���� ����B�� �����Ͽ� ����C�� �ű��
		HanoiTowerMove(3, 'A', 'B', 'C');
}
}