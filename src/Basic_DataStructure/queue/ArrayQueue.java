package queue;
public class ArrayQueue {//�迭 ��� ���� ť

		int front=0;//�ⱸ 0���� �ʱ�ȭ
		int rear=0;//�Ա� 0���� �ʱ�ȭ
		int QUE_LEN=4;//�迭 ũ��
		
		Object[] queArr = new Object[QUE_LEN];
		
	public boolean offer(Object data) {//�߰�
		if(NextIdx(rear) == front)//�Ա��� �ⱸ�� �ε����� �ϳ� ���̶��
		{
			System.out.println("ť�� ��ã���ϴ�.");
			return false;
		}
		rear = NextIdx(rear);
		queArr[rear] = data;
		return true;
	}
	
	public Object poll() {//����+��ȯ
		if(isEmpty())
		{
			System.out.println("ť�� ����ֽ��ϴ�.");
			return null;
		}
		front = NextIdx(front);
		return queArr[front];
	}
	
	public Object peek() {//��ȯ
		if(isEmpty())
		{
			System.out.println("ť�� ����ֽ��ϴ�.");
			return null;
			//System.exit(0);//�ý�������
		}
		return queArr[NextIdx(front)];	
	}
	
	public int NextIdx(int Idx)
	{
		if(Idx == QUE_LEN-1)//�迭ũ��-1
			return 0;//�迭�� ù��° �ε���
		else
			return Idx+1;
	}
	public boolean isEmpty() {
		return front == rear;//�ε����� ��ġ�� ���ٸ� ť�� ����ִ°��̴�.
	}
}