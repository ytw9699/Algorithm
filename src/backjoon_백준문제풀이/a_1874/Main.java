package a_1874;
import java.util.Scanner;
import java.util.Stack;
public class Main {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int yesNo = 1;//yes��1 no��0
		StringBuilder sb = new StringBuilder();
			
		int[] outputArr = new int[length];
		int[] inputArr = new int[length];
		
			for(int i=0; i<length; i++) {
				outputArr[i] = sc.nextInt();//4 3 6 7 8 5 2 1
			}
			for(int i=0; i<length; i++) {
				inputArr[i] = i+1; //1~8
			}
		
		Stack stack = new Stack();
		
		int maxValue = 0;//���� ���þȿ� �� �ִ밪 ����
		int k=0;
		
		for(int i=0; i<length; i++) {
			if(outputArr[i] > maxValue) {//���� ���þȿ� �� �ִ밪���� ����ϰ��� �ϴ� ���� ũ�ٸ�
				for (k = maxValue; k < outputArr[i]; k++) {
                    stack.push(inputArr[k]);//���ÿ� ���� �߰�
                    sb.append("+\n");
                }
				maxValue = (int)stack.peek();//���� ������ �������� �ִ밪���� �ٲ��� 
			}
			else if(((int)stack.peek()) != outputArr[i] ){//���� ������ �������� ����ϰ����ϴ°��� ���� �ʴٸ�
				yesNo =0; //no��0
				break;//�ݺ��� ���������� no���
			}
			stack.pop();
			sb.append("-\n");
		 }//for����
		    if(yesNo == 0) {
	        	System.out.print("NO");
	        }else {
	        	System.out.println(sb);
	        }
	}
}


