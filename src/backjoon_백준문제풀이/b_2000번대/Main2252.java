package b_2000����;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main2252 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String frist[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(frist[0]);
		int m = Integer.parseInt(frist[1]);
		
		String output = "";
		
		Student[] s = new Student[n];
		
		for(int i =0; i<n; i++) {
			s[i] = new Student(i+1,0);//�л���ȣ�� Ű �ʱⰪ
		}
		
		for(int i =0; i<m; i++) {
			String second[] = br.readLine().split(" ");
			int a = Integer.parseInt(second[0]);
			int b = Integer.parseInt(second[1]);
			s[b-1].addOrder(s[a-1].height);//Ű�񱳸� ���⼭ ������ 
		}
		br.close();
		
		PriorityQueue<Student> PriorityQueue  = new PriorityQueue<Student>();
		for(int i =0; i<n; i++) {
			PriorityQueue.offer(s[i]);
		}
		
		while(!PriorityQueue.isEmpty()) {//�켱������ �Űܼ� ��� �켱������ Ű�� �����������
			output = output+PriorityQueue.poll().number+" "; 
		}
		System.out.println(output);
	}
}
class Student implements Comparable<Student>{
	int number;
	int height;
	
	public Student(int number, int height) {
		this.number = number;//�л���ȣ
		this.height = height;//Ű
	}
	public void addOrder(int otherheight) {
		if(otherheight == 0)
			height++;
		else if(this.height == 0)
			height += otherheight+1;
		else
			height += otherheight;
	}
	@Override
	public int compareTo(Student target) {
		if(this.height > target.height) {//ù��° ������ �켱������ ������ 0����ū�� ��ȯ
			return 1;
		}
		else if(this.height < target.height) {//�ι��� ������ �켱������ ������ 0���������� ��ȯ
			return -1;
		}
		return 0;//�켱������ �����ϴٸ� 0��ȯ
	}
}
