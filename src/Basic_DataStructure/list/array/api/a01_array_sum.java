package list.array.api;

public class a01_array_sum {
	
public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9,10};//�迭�� �ڷᱸ�� 1~10������ ������ ����

		int sum = 0;
		
		for(int i=0; i<10; i++) //for���� �̿�, 1~10������ ���� ���ϴ� �˰���
			sum = sum + arr[i];
		
		System.out.println(sum);//55 ���
	}
}
