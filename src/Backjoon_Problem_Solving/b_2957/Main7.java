package b_2957;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
public class Main7 {
	public static void main(String[] args) throws Exception {
		
	HashMap<Integer, Integer> HashMap = new HashMap<Integer, Integer>();
	//노드에 해당하는 데이터와 높이를  키와 값으로 저장
	
	HashMap.put(0,0);//배열값을 넘어갈때를 대비
	HashMap.put(3000001,0);//배열값을 넘어갈때를 대비
	
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
		if(k==0) {//첫번째 루트값추가시
			HashMap.put((arr[k]),0);//첫번째 값, 높이 0
			arr2[k]=arr[k];
		}
		else if(k==1) {
			HashMap.put((arr[k]),1);//두번째 값, 높이 1
			arr2[k]=arr[k];
			Arrays.sort(arr2);//정렬유지
		}
		else {
		arr2[0]=arr[k];//arr2의 첫번째 요소에 추가
		Arrays.sort(arr2);//정렬유지
		
		int key1;//맵의 키값을 구하자
		
		int mid = Arrays.binarySearch(arr2, arr[k]);
		
			if(mid == arr2.length-1) {//이진탐색으로 찾아온 인덱스가 배열의 끝인덱스라면
				 key1 = 0;//해시값 KEY에 해당하는 높이는 0
			}else {
				 key1 = arr2[mid+1];//추가할 노드의 데이터보다 큰것들중 가장 작은것을 키로 지정
			}
		
		int key2 = arr2[mid-1];//추가할 노드의 데이터보다 작은것들중 가장 큰것을 키로 지정
		
		int firstHeight = (int)HashMap.get(key1);//첫번재 높이
		int secondHeight = (int)HashMap.get(key2);//두번째 높이
		
			if(firstHeight>secondHeight) {
				HashMap.put((arr[k]),firstHeight+1);//높이에 1을 추가
			}else {
				HashMap.put((arr[k]),secondHeight+1);//높이에 1을 추가
			}
	}
}
	for (int i = 0; i < arr.length; i++)  {
		count = count +HashMap.get(arr[i]);
		System.out.println(count);//높이 값 반복출력
	}

}
}