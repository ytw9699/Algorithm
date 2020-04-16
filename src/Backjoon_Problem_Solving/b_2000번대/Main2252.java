package b_2000번대;
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
			s[i] = new Student(i+1,0);//학생번호와 키 초기값
		}
		
		for(int i =0; i<m; i++) {
			String second[] = br.readLine().split(" ");
			int a = Integer.parseInt(second[0]);
			int b = Integer.parseInt(second[1]);
			s[b-1].addOrder(s[a-1].height);//키비교를 여기서 끝내고 
		}
		br.close();
		
		PriorityQueue<Student> PriorityQueue  = new PriorityQueue<Student>();
		for(int i =0; i<n; i++) {
			PriorityQueue.offer(s[i]);
		}
		
		while(!PriorityQueue.isEmpty()) {//우선순위를 매겨서 출력 우선순위는 키가 작은순서대로
			output = output+PriorityQueue.poll().number+" "; 
		}
		System.out.println(output);
	}
}
class Student implements Comparable<Student>{
	int number;
	int height;
	
	public Student(int number, int height) {
		this.number = number;//학생번호
		this.height = height;//키
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
		if(this.height > target.height) {//첫번째 인자의 우선순위가 높으면 0보다큰값 반환
			return 1;
		}
		else if(this.height < target.height) {//두번재 인자의 우선순위가 높으면 0보다작은값 반환
			return -1;
		}
		return 0;//우선순위가 동일하다면 0반환
	}
}
