package a_�ùķ��̼�;

 public class KiwiJuiceEasy3 {
	public static void main(String[] args) {
		int[] capacities=new int[]{10,10,10};//��ü ���� ũ��
		int[] bottles=new int[]{3,7,3};//�������ִ� �뷮
		int[] fromld=new int[]{1,0,1};//�ű�� �������� ��
		int[] told=new int[]{0,1,0};//�ű��� �޾ƾ��ϴ� ���� ��
		
		int[] a = thePouring(capacities,bottles,fromld,told);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
}
	public static int[] thePouring(int[] capacities, int[] bottles, int[] fromld, int[] told){
	
		for (int i = 0; i < fromld.length; i++){
			
			int sum = bottles[fromld[i]] + bottles[told[i]];
			bottles[told[i]] = Math.min(sum,capacities[told[i]]);
			bottles[fromld[i]] = sum-bottles[told[i]];
			
		}
			 return bottles;
}
}

 
