package b_2957;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
public class Main10 {
	public static void main(String[] args) throws Exception {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int arrCount = Integer.parseInt(br.readLine());
	int arr[] = new int[arrCount];
	
	TreeMap map = new TreeMap();
	
	map.put(0, 0);
	map.put(300001, 0); 
	
	for(int i =0; i<arrCount; i++){
		arr[i]=Integer.parseInt(br.readLine());
	}
	br.close();
	
	for(int k=0; k<arrCount; k++) {
		if(k==0) {//첫번째 루트값추가시
			 map.put(arr[k], 0); 
		}
		else if(k==1) {
			map.put(arr[k], 1); 
		}
		else {
		map.put(arr[k], 1); 
		
		Map.Entry key1 = map.higherEntry(arr[k]);
	    Map.Entry key2 = map.lowerEntry(arr[k]);
		
		int firstHeight = (int) key1.getValue(); //첫번재 높이
		int secondHeight = (int) key2.getValue();  //두번째 높이
		
			if(firstHeight>secondHeight) {
				map.put(arr[k], firstHeight+1); 
			}else {
				map.put(arr[k], secondHeight+1); 
			}
	}
}
	int count=0;
	for(int i =0; i<arrCount; i++){
		count = count + (int)map.get(arr[i]);
		System.out.println(count);
	}
}
}