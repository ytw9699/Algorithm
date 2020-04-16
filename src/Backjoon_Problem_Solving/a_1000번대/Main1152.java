package a_1000번대;
import java.util.Scanner;
public class Main1152 {
	public static void main(String[] args)
	{
		String words = new String();
		
		Scanner sc= new Scanner(System.in);

		words = sc.nextLine().trim();//nextLine은 개행도 입력받는특성
		
		if (!words.isEmpty()) {
			String[] output = words.split(" ");
			
			System.out.println(output.length);
        } else {
        	System.out.println(0);//개행을 입력받는다면 0출력
        }
	}
}

