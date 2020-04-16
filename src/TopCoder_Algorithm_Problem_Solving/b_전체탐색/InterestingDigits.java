﻿package b_전체탐색;
import java.util.*;
 public class InterestingDigits {
	public static void main(String[] args) {
		int base=10;
		
		int[] a = digits(base);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
}
	
	public static int[] digits(int base){
			
			 ArrayList <Integer> v = new ArrayList<Integer>();
			 
			 for(int n = 2; n<base; n++)
			 {
				 boolean ok = true;
				 
				 for(int k1 =0; k1<base; k1++ )
				 {
					 for(int k2 = 0; k2<base; k2++ )
					 {
						 for(int k3 = 0; k3<base; k3++ )
						 {
						 if( (k1 + k2*base + k3*base*base) % n == 0 && (k1 + k2 + k3) % n != 0 ) {
							 // n의 배수 숫자로 각 숫자의 합이 n의 배수가 아니면
							// n을 제외합니다.
							 ok = false;
							 break;
							 }
						 }
					if( !ok ) break;
				 }
				 if( !ok ) break;
			 }
			 if( ok ) v.add( n );
			 }
			 
				int [] ans = new int[v.size()];
				
				for( int i = 0; i<v.size(); i++ ) 
					ans[i] = v.get(i);
				
			 return ans;
}
}

 
