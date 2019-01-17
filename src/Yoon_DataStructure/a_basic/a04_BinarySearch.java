package a_basic;
public class a04_BinarySearch {//����Ž��
	static int BSearch(int ar[], int len, int target)	{
		int first=0;   // Ž�� ����� ���� �ε��� ��
		int last=len-1;   // Ž�� ����� ������ �ε��� ��
		int mid; 

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
		}
		return -1;   // ã�� ������ �� ��ȯ�Ǵ� �� -1
	} 
	public static void main(String[] args) {
		int arr[]={1, 3, 5, 7, 9, 12, 21, 23, 27};
		int idx;
		
		idx=BSearch(arr, arr.length, 3);
		if(idx==-1)
			System.out.println("�迭�ȿ� ã���� �ϴ°��� �����ϴ�.");
		else
			System.out.printf("Ÿ���� ����� �ε���: %d \n", idx);
	}
}
	