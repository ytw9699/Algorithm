package a_1068;
import java.util.Scanner;
public class Main2 {
	public static Node tree[];
	public static int n;
	public static int delList[];
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();//노드의 갯수 받고
		int i;
		int pa;
		tree = new Node[n];
		delList = new int[n];//삭제리스트 배열
		sc.nextLine();
		String line[] = sc.nextLine().split(" ");
		for(i=0; i<n; i++) {//노드 일단 전부 생성
			tree[i] = new Node();
		}
		for(i=0; i<n; i++) {
			pa = Integer.parseInt(line[i]);
			tree[i].num = i;//노드 번호 부여
			tree[i].parent = pa;//노드의 부모 번호 부여
			if(pa != -1) {
				tree[pa].setChild(i);//부모의 노드로가서 자식을 추가한다
			}
		}
		delete(sc.nextInt());//삭제할 번호 받고
		System.out.println(getLeaf());
	}
	private static int getLeaf(){
		int i =0;
		int cnt =0;
		for(i=0; i<n; i++) {
			if(tree[i] != null && tree[i].childCnt == 0) // 자식카운트가 0인것만 
				cnt++;
		}
		return cnt;
	}
		public static void delete(int num) {
			makeDelList(num);
			int i, k, pa;
			for(i=0; i<n; i++) {
				k = tree[i].num;
				if(delList[k] == 1) {
					pa = tree[k].parent;
					tree[k] =null;//노드를 없애준다
					if(pa != -1 && tree[pa]!=null) {
						tree[pa].childCnt--;//노드없앴으면 자식수를 줄인다
						tree[pa].child[k]=0;
					}
				}
			}
		}
		private static void makeDelList(int num) {
			delList[num] = 1;
			for(int i=0; i<n; i++) {
				if(tree[num].child[i] == 1)
					makeDelList(i);//재귀를 활용해 삭제리스트를 만들고
			}
		}
}
class Node{
	int num;//노드번호
	int parent;//부모번호
	int child[] = new int[50];//자식리스트
	int childCnt;//자식수 카운트
	public void setChild(int childNum) {
		child[childNum] = 1;//자식이 배열에 몇개 추가된다는 개념으로 보자
		childCnt++;//자식 카운트수 세고
	}
}
		

	
