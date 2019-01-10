package b_2957;
public class aaa {

	public static void main(String[] args) {
		Runtime.getRuntime().gc();

		long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		System.out.println("used memory is " + used + " bytes");
		System.out.println("used memory is " + used + " bytes");
		
	}

}
