package A_1_testing;
import java.util.Arrays;
 public class Main {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {1,1};
		System.out.println(solution(a,b));
	
}
	 public static int solution(int[] people, int[] tshirts) {
		 int answer = 0;
		 
         Arrays.sort(people);
         Arrays.sort(tshirts);

         for(int i=0; i<people.length; i++){
             for(int j=0; j<tshirts.length; j++){
                 if(people[i] <= tshirts[j]){
                	 answer +=1;   
                	 tshirts[j]=0;
                	 break;
                 }
             }
         }
         return answer;
     }
}

 
 
 
 

 
 