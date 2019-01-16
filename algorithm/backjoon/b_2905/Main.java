package b_2905;

import java.util.LinkedList;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	LinkedList<Integer> queue = new LinkedList();
	
	int count = sc.nextInt();
	
	int width = sc.nextInt();
	
	for(int i =0; i<count; i++) {
		queue.offer(sc.nextInt());
	}
	
	while(!queue.isEmpty()){
		
		for(int j=0; j<width; j++) {
			queue.poll();
		}
		queue.peek();
		
	
	}
	
	
		
	}
}

