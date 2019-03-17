package queue;
public class MyQueue2 {//�迭 ��� ť

		int front=0;//�Ӹ�
		int rear=0;//����
		int QUE_LEN=4;//�迭ũ��
		
		Object[] queArr = new Object[QUE_LEN];
	
	public Object Enqueue(Object data) {//�߰�
		if(NextIdx(rear) == front)
		{
			System.out.println("ť�� ��ã���ϴ�.");
			System.exit(0);
		}

		rear = NextIdx(rear);
		queArr[rear] = data;
		
		return data;
	}
	
	public Object Dequeue() {//����+��ȯ
		if(isEmpty())
		{
			System.out.println("ť�� ����ֽ��ϴ�.");
			System.exit(0);
		}
		front = NextIdx(front);
		
		return queArr[front];
	}
	
	public Object peek() {//��ȯ
		if(isEmpty())
		{
			System.out.println("ť�� ����ֽ��ϴ�.");
			System.exit(0);
		}
		return queArr[NextIdx(front)];	
	}
	
	public int NextIdx(int Idx)
	{
		if(Idx == QUE_LEN-1)//�迭ũ��-1
			return 0;
		else
			return Idx+1;
	}
	public boolean isEmpty() {
		return front == rear;
	}
}