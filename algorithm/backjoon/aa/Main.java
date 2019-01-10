package aa;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {

		Runtime.getRuntime().gc();

		long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		System.out.println("used memory is " + used + " bytes");
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, Integer> HashMap = new HashMap<Integer, Integer>();
		HashMap.put(0,0);
		HashMap.put(-1,0);
		HashMap.put(3000001,0);
			
		
		Runtime.getRuntime().gc();

		long used2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		System.out.println("used memory is " + used2 + " bytes");
		
	}

}
