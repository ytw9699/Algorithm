package b_2000����;
import java.util.Scanner;
public class Main2941 {
	public static void main(String[] args)
	{
		String words = new String();
		
		Scanner sc= new Scanner(System.in);

		String croWords[] = new String[]{"c=","c-","dz=","d-","lj","nj","s=","z="};
									//ũ�ξ�Ƽ�� ���ڵ�
		
		words = sc.nextLine().trim();
			
		int k =0;
		for(int i=0; i<croWords.length; i++){
			while(words.contains(croWords[i])) {//ũ�ξ�Ƽ�� ���ڰ� ���ԵǾ��ִٸ�
				words = words.replaceFirst(croWords[i],"*");//���� *���ڷ� �ٲ۴�
				k=k+1;//�ٲ� Ƚ���� ����
			}
		}
		while(words.contains("*")) {
			words = words.replace("*","");//ũ�ξ�Ƽ�� ���ڵ��� ���� �������� �ٲ��ش�
		}
		System.out.println(words.length()+k);//�����ִ� ������ ������ + ũ�ξ�Ƽ�� Ƚ���� ���ؼ� ���
	}
}
