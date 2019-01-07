package a_1874;

import java.util.Scanner;
import java.util.Stack;
public class Main {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		
		int[] outputArr = new int[length];
		int[] inputArr = new int[length];
		
			for(int i=0; i<length; i++) {
				outputArr[i] = sc.nextInt(); 
			}
			
			for(int i=0; i<length; i++) {
				inputArr[i] = i+1; 
			}
		
		Stack stack = new Stack();
		int currentPointer = 0;
		int j=0;
		for(int i=0; i<length; i++) {
			
			if(i==0) {
				for(j=0; j<outputArr[0]; j++){
					stack.push(inputArr[j]);
					System.out.println("+");
				}
				stack.pop();
				System.out.println("-");
			}
			else if(outputArr[i] == length){
				while(!stack.empty()) {
					stack.pop();
					System.out.println("-");
				}
			}
			else{
				if(outputArr[i] < outputArr[currentPointer]) {
					if(!stack.empty()) {
					stack.pop();
					System.out.println("-");
					}
				}
				else {
					for(int n=0; n<outputArr[i]-outputArr[currentPointer]; n++) {
						stack.push(inputArr[j++]);
						System.out.println("+");
					}
					stack.pop();
					System.out.println("-");
					currentPointer = i;
				}
			}
		}
	}
}

