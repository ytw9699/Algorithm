package b_�ڷᱸ��;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt(); // ����� ��
		 int[] arr = new int[n]; // �۾��� ���� �迭 
		 int top = -1; // �迭 ��ġ 
		 String input; // ���
		 
		 for (int i=0; i<n; i++) { 
			 
			 input = sc.next(); 
			 
			 if (input.equals("push")) { // ���� X�� ���ÿ� �ִ� �����̴�. 
				 top++; 
				 arr[top] = sc.nextInt(); 
				 } 
			else if (input.equals("pop")) { // ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. (���� ��쿡�� -1)  
			 if (top == -1) {
			  System.out.println(-1); 
			 }else { 
			System.out.println(arr[top]);
			top--; 
			} 
			} else if (input.equals("size")) { // ���ÿ� ����ִ� ������ ������ ����Ѵ�. 
			 System.out.println(top+1); } 
			else if (input.equals("empty")) // ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�. 
				{ if (top == -1){
					System.out.println(1); 
					} else {
						System.out.println(0); } 
				} else if (input.equals("top")) // ������ ���� ���� �ִ� ������ ����Ѵ�. (���� ��쿡�� -1) 
					{ if (top == -1){
						System.out.println(-1); } else { System.out.println(arr[top]); 
						}
					}
		 }
	}
}

