package a_1068;
import java.util.Scanner;
public class Main2 {
	public static Node tree[];
	public static int n;
	public static int delList[];
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();//����� ���� �ް�
		int i;
		int pa;
		tree = new Node[n];
		delList = new int[n];//��������Ʈ �迭
		sc.nextLine();
		String line[] = sc.nextLine().split(" ");
		for(i=0; i<n; i++) {//��� �ϴ� ���� ����
			tree[i] = new Node();
		}
		for(i=0; i<n; i++) {
			pa = Integer.parseInt(line[i]);
			tree[i].num = i;//��� ��ȣ �ο�
			tree[i].parent = pa;//����� �θ� ��ȣ �ο�
			if(pa != -1) {
				tree[pa].setChild(i);//�θ��� ���ΰ��� �ڽ��� �߰��Ѵ�
			}
		}
		delete(sc.nextInt());//������ ��ȣ �ް�
		System.out.println(getLeaf());
	}
	private static int getLeaf(){
		int i =0;
		int cnt =0;
		for(i=0; i<n; i++) {
			if(tree[i] != null && tree[i].childCnt == 0) // �ڽ�ī��Ʈ�� 0�ΰ͸� 
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
					tree[k] =null;//��带 �����ش�
					if(pa != -1 && tree[pa]!=null) {
						tree[pa].childCnt--;//���������� �ڽļ��� ���δ�
						tree[pa].child[k]=0;
					}
				}
			}
		}
		private static void makeDelList(int num) {
			delList[num] = 1;
			for(int i=0; i<n; i++) {
				if(tree[num].child[i] == 1)
					makeDelList(i);//��͸� Ȱ���� ��������Ʈ�� �����
			}
		}
}
class Node{
	int num;//����ȣ
	int parent;//�θ��ȣ
	int child[] = new int[50];//�ڽĸ���Ʈ
	int childCnt;//�ڽļ� ī��Ʈ
	public void setChild(int childNum) {
		child[childNum] = 1;//�ڽ��� �迭�� � �߰��ȴٴ� �������� ����
		childCnt++;//�ڽ� ī��Ʈ�� ����
	}
}
		

	
