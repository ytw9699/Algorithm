package b_2957;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
public class main4 {
	
	public static void main(String[] args) {
		Runtime.getRuntime().gc();

		long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		System.out.println("used memory is " + used + " bytes");
		
	HashMap<Integer, Integer> HashMap = new HashMap<Integer, Integer>();
	HashMap.put(0,0);
	HashMap.put(-1,0);
	HashMap.put(3000001,0);
	Scanner sc = new Scanner(System.in);	
	
	int arrCount = sc.nextInt();//8
	int count=0;
	int arr[] = new int[arrCount];
	int arr2[] = new int[arrCount];
	
	for(int i =0; i<arrCount; i++){
		arr[i]=sc.nextInt();
	}
	
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
			int[] key = binarySearch(arr2,arr[k]);
			int first = (int)HashMap.get(key[0]);
			int second = (int)HashMap.get(key[1]);
			if(first>second) {
				HashMap.put((arr[k]),first+1);
			}else {
				HashMap.put((arr[k]),second+1);
			}
		}
	}
	for (int i = 0; i < arr.length; i++) {
		count = count +HashMap.get(arr[i]);
		System.out.println(count);
	}
	Runtime.getRuntime().gc();

	long used2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

	System.out.println("used memory is " + used2 + " bytes");

}
	private static int[] binarySearch(int searchArr[], int target) {
		int start = 0;
		int end = searchArr.length;
		int mid=0;
		int keyArr[]=new int[2];
		while(start <= end) {
			mid =(start+end)/2;
			if (target == searchArr[mid]) {
				if(mid == searchArr.length-1) {
					keyArr[0]=-1;
				}else {
					keyArr[0]=searchArr[mid+1];//3	
				}
				keyArr[1]=searchArr[mid-1];//0
                return keyArr;
			}else {
				if(searchArr[mid] < target) {
					start = mid +1;
				}else {
					end = mid-1;
				}
			}
		}
		return keyArr;
}
}