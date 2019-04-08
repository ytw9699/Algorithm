package queue;
public class ArrayQueue {//배열 기반 원형 큐

		int front=0;//출구 0으로 초기화
		int rear=0;//입구 0으로 초기화
		int QUE_LEN=4;//배열 크기
		
		Object[] queArr = new Object[QUE_LEN];
		
	public boolean offer(Object data) {//추가
		if(NextIdx(rear) == front)//입구와 출구의 인덱스가 하나 차이라면
		{
			System.out.println("큐가 꽉찾습니다.");
			return false;
		}
		rear = NextIdx(rear);
		queArr[rear] = data;
		return true;
	}
	
	public Object poll() {//삭제+반환
		if(isEmpty())
		{
			System.out.println("큐가 비어있습니다.");
			return null;
		}
		front = NextIdx(front);
		return queArr[front];
	}
	
	public Object peek() {//반환
		if(isEmpty())
		{
			System.out.println("큐가 비어있습니다.");
			return null;
			//System.exit(0);//시스템종료
		}
		return queArr[NextIdx(front)];	
	}
	
	public int NextIdx(int Idx)
	{
		if(Idx == QUE_LEN-1)//배열크기-1
			return 0;//배열의 첫번째 인덱스
		else
			return Idx+1;
	}
	public boolean isEmpty() {
		return front == rear;//인덱스의 위치가 같다면 큐가 비어있는것이다.
	}
}