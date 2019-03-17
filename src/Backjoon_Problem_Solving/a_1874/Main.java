package a_1874;
import java.util.Scanner;
import java.util.Stack;
public class Main {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int yesNo = 1;//yes는1 no는0
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
		
		int maxValue = 0;//현재 스택안에 들어간 최대값 변수
		int k=0;
		
		for(int i=0; i<length; i++) {
			if(outputArr[i] > maxValue) {//현재 스택안에 들어간 최대값보다 출력하고자 하는 값이 크다면
				for (k = maxValue; k < outputArr[i]; k++) {
                    stack.push(inputArr[k]);//스택에 값을 추가
                    sb.append("+\n");
                }
				maxValue = (int)stack.peek();//현재 스택의 맨위값을 최대값으로 바꿔줌 
			}
			else if(((int)stack.peek()) != outputArr[i] ){//현재 스택의 맨위값과 출력하고자하는값이 같지 않다면
				yesNo =0; //no는0
				break;//반복문 빠져나가서 no출력
			}
			stack.pop();
			sb.append("-\n");
		 }//for문끝
		    if(yesNo == 0) {
	        	System.out.print("NO");
	        }else {
	        	System.out.println(sb);
	        }
	}
}


