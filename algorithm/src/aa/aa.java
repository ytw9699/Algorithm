package aa;
import java.util.Scanner;
public class aa {

	public static void main(String[] args) {
		Runtime.getRuntime().gc();

		long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		System.out.println("used memory is " + used + " bytes");
		
		Scanner aaa = new Scanner(System.in);
		
		Runtime.getRuntime().gc();

		long used2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		System.out.println("used memory is " + used2 + " bytes");
	}

}
