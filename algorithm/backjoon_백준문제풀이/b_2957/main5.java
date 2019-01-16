package b_2957;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
public class main5 {
	
	public static void main(String[] args) {
	
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
			//System.out.println(k+"=k");
			//System.out.println("arr[k]="+arr[k]);
			arr2[0]=arr[k];
			//System.out.println(k+"=k");
			//System.out.println("arr2[k]="+arr2[k]);
			Arrays.sort(arr2);
			int[] key = binarySearch(arr2,arr[k]);
			//System.out.println(key[0]);//3,
			//System.out.println(key[1]);//0,
			//System.out.println(HashMap.size());
			int first = (int)HashMap.get(key[0]);
			//System.out.println("first="+first);
			int second = (int)HashMap.get(key[1]);
			//System.out.println("second="+second);
			if(first>second) {
				//System.out.println("mapkeyfirst="+arr[k]);
				HashMap.put((arr[k]),first+1);
				//System.out.println("mapvaluefirst="+first+1);
			}else {
				//System.out.println("mapkeysecond="+arr[k]);
				HashMap.put((arr[k]),second+1);
				//System.out.println("mapvaluesecond="+second+1);
			}
			/*for (int i = 0; i < arr2.length; i++) {
			    System.out.print(arr2[i] + "/");
			}*/
		}
	}
	for (int i = 0; i < arr.length; i++) {
		    //System.err.print(arr2[i] + " ");
		//System.out.print(HashMap.get(arr[i]));
		count = count +HashMap.get(arr[i]);
		System.out.println(count);
	}
}
	private static int[] binarySearch(int searchArr[], int target) {
		int start = 0;
		int end = searchArr.length;
		int mid=0;
		int keyArr[]=new int[2];
		while(start <= end) {
			mid =(start+end)/2;
			if (target == searchArr[mid]) {
			//	System.out.println("midval"+searchArr[mid]);
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