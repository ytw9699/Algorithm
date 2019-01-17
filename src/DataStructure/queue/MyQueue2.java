package queue;
public class MyQueue2 {//배열 기반 큐

		int front=0;//머리
		int rear=0;//꼬리
		int QUE_LEN=4;//배열크기
		
		Object[] queArr = new Object[QUE_LEN];
	
	public Object Enqueue(Object data) {//추가
		if(NextIdx(rear) == front)
		{
			System.out.println("큐가 꽉찾습니다.");
			System.exit(0);
		}

		rear = NextIdx(rear);
		queArr[rear] = data;
		
		return data;
	}
	
	public Object Dequeue() {//삭제+반환
		if(isEmpty())
		{
			System.out.println("큐가 비어있습니다.");
			System.exit(0);
		}
		front = NextIdx(front);
		
		return queArr[front];
	}
	
	public Object peek() {//반환
		if(isEmpty())
		{
			System.out.println("큐가 비어있습니다.");
			System.exit(0);
		}
		return queArr[NextIdx(front)];	
	}
	
	public int NextIdx(int Idx)
	{
		if(Idx == QUE_LEN-1)//배열크기-1
			return 0;
		else
			return Idx+1;
	}
	public boolean isEmpty() {
		return front == rear;
	}
}