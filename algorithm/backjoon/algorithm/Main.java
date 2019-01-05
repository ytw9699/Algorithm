package algorithm;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String output;
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String instruction[] = str.split(" ");
		
		int front  = Integer.parseInt(instruction[0]);
		
		int rear  = Integer.parseInt(instruction[1]);
		
		if(front >= rear) {
			 output = Integer.toString(front);
		}
		else {
			output = Integer.toString(rear);
		}
		String output2[] = output.split("");
	
		for(int i=output2.length-1; i>=0; i--) {
			System.out.print(output2[i]);
		}
	}
}
