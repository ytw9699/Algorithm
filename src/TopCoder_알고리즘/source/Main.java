package source;

 public class Main {
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
			 int toSpace = capacities[to] - bottles[to];//옮길려는곳의 남은공간
			 
			 if (toSpace >= bottles[from]) { //옮기려는 양이 넘치지 않는다면
				 bottles[to] += bottles[from];
				 bottles[from] = 0;//병을 비우자
			 }else{
				 bottles[to] += toSpace;
				 bottles[from] -= toSpace;
			 }
		}
			 return bottles;
}
}

 
