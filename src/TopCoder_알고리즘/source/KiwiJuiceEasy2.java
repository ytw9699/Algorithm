package source;

 public class KiwiJuiceEasy2 {
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
			 int from = fromld[i];
			 int to = told[i];
			
			 int vol = Math.min(bottles[from], capacities[to]-bottles[to]);//�ּҰ��� ���ؼ�
			 
			 bottles[from] -= vol; //���ְ�
			 bottles[to] += vol;  //��������
		}
			 return bottles;
}
}

 
