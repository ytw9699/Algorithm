package A_1_testing;
import java.util.Scanner;

 public class Main {
	public static void main(String[] args) {
		int[] capacities=new int[]{10,10,10};
		int[] bottles=new int[]{3,7,3};
		int[] fromld=new int[]{1,0,1,0};
		int[] told=new int[]{0,1,0,1};
		int[] a = thePouring(capacities,bottles,fromld,told);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
}
	public static int[] thePouring(int[] capacities, int[] bottles, int[] fromld, int[] told){
		 
		for (int i = 0; i < fromld.length; i++){
			
			 int f = fromld[i];
			 int t = told[i];
			 int space = capacities[t] - bottles[t];
			 
			 if (space >= bottles[f]) { 
				 int vol = bottles[f];
			 bottles[t] += vol;
			 bottles[f] = 0;
			 }else{
				 
			 int vol = space;
			 bottles[t] += vol;
			 bottles[f] -= vol;
			 }
			}
			 return bottles;
		 }
}


