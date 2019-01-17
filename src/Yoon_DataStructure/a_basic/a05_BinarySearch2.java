package a_basic;
public class a05_BinarySearch2 {//����Ž��
	static int BSearch(int ar[], int len, int target)	{
		int first=0;   // Ž�� ����� ���� �ε��� ��
		int last=len-1;   // Ž�� ����� ������ �ε��� ��
		int mid; 
		int opCount=0;   // �񱳿����� Ƚ���� ���

		while(first<=last){
			mid=(first+last)/2;   // Ž�� ����� �߾��� ã�´�. 

			if(target==ar[mid]){//�߽��� �Ǵ� �ٽ� ���� -����Ƚ���� ���õȰ�
				// �߾ӿ� ����� ���� Ÿ���̶��
				return mid;//Ž���Ϸ�,�ε��� ��ȯ
			}
			else  {  // Ÿ���� �ƴ϶�� 
				if(target<ar[mid])   
					last=mid-1;   // �޺κ��� Ž�� ��󿡼� ����
				else
					first=mid+1;   // �պκ��� Ž�� ��󿡼� ����
			}
			opCount+=1;   // �񱳿����� Ƚ�� 1 ����
		}
		System.out.printf("�񱳿��� Ƚ��: %d \n", opCount);// Ž�� ���� �� ����Ƚ�� ���
		return -1;   // ã�� ������ �� ��ȯ�Ǵ� �� -1
	} 
	public static void main(String[] args) {
		int arr1[]={0, 1, 5};
		int arr2[]={0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int arr3[]={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17};
		int idx;
		
		idx=BSearch(arr1, arr1.length, 18);
		if(idx==-1)
			System.out.println("�迭�ȿ� ã���� �ϴ°��� �����ϴ�.");
		else
			System.out.printf("Ÿ���� ����� �ε���: %d \n", idx);
		
		idx=BSearch(arr2, arr2.length, 18);
		if(idx==-1)
			System.out.println("�迭�ȿ� ã���� �ϴ°��� �����ϴ�.");
		else
			System.out.printf("Ÿ���� ����� �ε���: %d \n", idx);
		
		idx=BSearch(arr3, arr3.length, 18);
		if(idx==-1)
			System.out.println("�迭�ȿ� ã���� �ϴ°��� �����ϴ�.");
		else
			System.out.printf("Ÿ���� ����� �ε���: %d \n", idx);
	}
}
	