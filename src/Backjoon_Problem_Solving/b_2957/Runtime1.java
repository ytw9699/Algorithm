package b_2957;

public class Runtime1 {

	public static void main(String[] args) {
		Runtime.getRuntime().gc();

		long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		System.out.println("used memory is " + used + " bytes");
		
		
		Runtime.getRuntime().gc();

		long used2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		System.out.println("used memory is " + used2 + " bytes");
		
	}

}
