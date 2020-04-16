package j_10000번대;
import java.util.Scanner;
public class Main10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            String[] arr = sc.next().split(",");
            System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
        }
    }
}
