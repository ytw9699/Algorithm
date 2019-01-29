package source;

 public class Main {
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
			 int toSpace = capacities[to] - bottles[to];//�ű���°��� ��������
			 
			 if (toSpace >= bottles[from]) { //�ű���� ���� ��ġ�� �ʴ´ٸ�
				 bottles[to] += bottles[from];
				 bottles[from] = 0;//���� �����
			 }else{
				 bottles[to] += toSpace;
				 bottles[from] -= toSpace;
			 }
		}
			 return bottles;
}
}

 
