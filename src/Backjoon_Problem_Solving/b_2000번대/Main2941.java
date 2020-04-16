package b_2000번대;
import java.util.Scanner;
public class Main2941 {
	public static void main(String[] args)
	{
		String words = new String();
		
		Scanner sc= new Scanner(System.in);

		String croWords[] = new String[]{"c=","c-","dz=","d-","lj","nj","s=","z="};
									//크로아티아 문자들
		
		words = sc.nextLine().trim();
			
		int k =0;
		for(int i=0; i<croWords.length; i++){
			while(words.contains(croWords[i])) {//크로아티아 문자가 포함되어있다면
				words = words.replaceFirst(croWords[i],"*");//전부 *문자로 바꾼다
				k=k+1;//바꾼 횟수를 센다
			}
		}
		while(words.contains("*")) {
			words = words.replace("*","");//크로아티아 문자들을 전부 공백으로 바꿔준다
		}
		System.out.println(words.length()+k);//남아있는 문자의 갯수와 + 크로아티아 횟수를 더해서 출력
	}
}
