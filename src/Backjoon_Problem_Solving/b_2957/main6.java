package b_2957;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
public class main6 {
	public static void main(String[] args) throws Exception {
		
	HashMap<Integer, Integer> HashMap = new HashMap<Integer, Integer>();
	HashMap.put(0,0);
	HashMap.put(-1,0);
	HashMap.put(3000001,0);
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int arrCount = Integer.parseInt(br.readLine());
	int count=0;
	int arr[] = new int[arrCount];
	int arr2[] = new int[arrCount];
	
	for(int i =0; i<arrCount; i++){
		arr[i]=Integer.parseInt(br.readLine());
	}
	br.close();
	
	for(int k=0; k<arrCount; k++) {
		if(k==0) {
			HashMap.put((arr[k]),0);//데이터 추가
			arr2[k]=arr[k];
		}
		else if(k==1) {
			HashMap.put((arr[k]),1);//데이터 추가
			arr2[k]=arr[k];
			Arrays.sort(arr2);
		}
	else {
		arr2[0]=arr[k];
		Arrays.sort(arr2);
		
		int key1;
		int mid = Arrays.binarySearch(arr2, arr[k]);
		if(mid == arr2.length-1) {
			 key1 = -1;
		}else {
			 key1 = arr2[mid+1];
		}
		int key2 = arr2[Arrays.binarySearch(arr2, arr[k])-1];
		int first = (int)HashMap.get(key1);
		int second = (int)HashMap.get(key2);
		if(first>second) {
			HashMap.put((arr[k]),first+1);
		}else {
			HashMap.put((arr[k]),second+1);
		}
	}
}
	for (int i = 0; i < arr.length; i++)  {
		count = count +HashMap.get(arr[i]);
		System.out.println(count);
	}

}
}