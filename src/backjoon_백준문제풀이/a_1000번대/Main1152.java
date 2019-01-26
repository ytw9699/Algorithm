package a_1000¹ø´ë;
import java.util.Scanner;
public class Main1152 {
	public static void main(String[] args)
	{
		String words = new String();
		
		Scanner sc= new Scanner(System.in);

		words = sc.nextLine().trim();
		
		if (!words.isEmpty()) {
			String[] output = words.split(" ");
			
			System.out.println(output.length);
        } else {
        	System.out.println(0);
        }
	}
}

