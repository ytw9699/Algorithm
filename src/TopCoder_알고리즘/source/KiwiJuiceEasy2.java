package source;

 public class KiwiJuiceEasy2 {
	public static void main(String[] args) {
		int[] capacities=new int[]{10,10,10};//전체 병의 크기
		int[] bottles=new int[]{3,7,3};//현재들어있는 용량
		int[] fromld=new int[]{1,0,1};//옮기고 싶은곳의 병
		int[] told=new int[]{0,1,0};//옮김을 받아야하는 곳의 병
		
		int[] a = thePouring(capacities,bottles,fromld,told);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
}
	
	public static int[] thePouring(int[] capacities, int[] bottles, int[] fromld, int[] told){
		for (int i = 0; i < fromld.length; i++){
			 int from = fromld[i];
			 int to = told[i];
			
			 int vol = Math.min(bottles[from], capacities[to]-bottles[to]);//최소값을 구해서
			 
			 bottles[from] -= vol; //빼주고
			 bottles[to] += vol;  //더해주자
		}
			 return bottles;
}
}

 
