package b_2957;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
public class Main7 {
	public static void main(String[] args) throws Exception {
		
	HashMap<Integer, Integer> HashMap = new HashMap<Integer, Integer>();
	//��忡 �ش��ϴ� �����Ϳ� ���̸�  Ű�� ������ ����
	
	HashMap.put(0,0);//�迭���� �Ѿ���� ���
	HashMap.put(3000001,0);//�迭���� �Ѿ���� ���
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int arrCount = Integer.parseInt(br.readLine());
	int count=0;
	int arr[] = new int[arrCount];
	int arr2[] = new int[arrCount];
	
	for(int i =0; i<arrCount; i++){
		arr[i]=Integer.parseInt(br.readLine());
	}
	br.close();
	
	for(int k=0; k<arrCount; k++) {
		if(k==0) {//ù��° ��Ʈ���߰���
			HashMap.put((arr[k]),0);//ù��° ��, ���� 0
			arr2[k]=arr[k];
		}
		else if(k==1) {
			HashMap.put((arr[k]),1);//�ι�° ��, ���� 1
			arr2[k]=arr[k];
			Arrays.sort(arr2);//��������
		}
		else {
		arr2[0]=arr[k];//arr2�� ù��° ��ҿ� �߰�
		Arrays.sort(arr2);//��������
		
		int key1;//���� Ű���� ������
		
		int mid = Arrays.binarySearch(arr2, arr[k]);
		
			if(mid == arr2.length-1) {//����Ž������ ã�ƿ� �ε����� �迭�� ���ε������
				 key1 = 0;//�ؽð� KEY�� �ش��ϴ� ���̴� 0
			}else {
				 key1 = arr2[mid+1];//�߰��� ����� �����ͺ��� ū�͵��� ���� �������� Ű�� ����
			}
		
		int key2 = arr2[mid-1];//�߰��� ����� �����ͺ��� �����͵��� ���� ū���� Ű�� ����
		
		int firstHeight = (int)HashMap.get(key1);//ù���� ����
		int secondHeight = (int)HashMap.get(key2);//�ι�° ����
		
			if(firstHeight>secondHeight) {
				HashMap.put((arr[k]),firstHeight+1);//���̿� 1�� �߰�
			}else {
				HashMap.put((arr[k]),secondHeight+1);//���̿� 1�� �߰�
			}
	}
}
	for (int i = 0; i < arr.length; i++)  {
		count = count +HashMap.get(arr[i]);
		System.out.println(count);//���� �� �ݺ����
	}

}
}