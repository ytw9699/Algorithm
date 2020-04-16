package Ch_03_Stacks_and_Queues;

import java.util.EmptyStackException;
import java.util.LinkedList;
//스택 2개를 이용해서 메모리 공간을 줄임
public class MyStack_LinkedList3<T> extends LinkedList {
	
	LinkedList minSaveStack;
	
	public MyStack_LinkedList3() {
		minSaveStack = new LinkedList();
	}
	
	private StackNode<T> top;
	private StackNode<T> min;//추가
	
	private static class StackNode<T> {
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data) {
			this.data = data;
		}
		
		public T getData() {
			return data;
		}
	}

	public T mypop() {
		if (top == null) {
			throw new EmptyStackException();
		}
		T item = top.getData();
		
		if(item == min.data) {
			minSaveStack.pop();
			if(!minSaveStack.isEmpty()) {
			min.data = (T) minSaveStack.peek();
			}
			else {//비어있다면 최소값을 null하자
				min = null;
			}
		}
		top = top.next;
		
		return item;
	}

	public void mypush(T item) { 
		StackNode<T> t = new StackNode<T>(item);
		
		if(top == null || (int)t.data <= (int)min.data) {////추가
			min = t;
			minSaveStack.push((int)t.data);
		}
		
		t.next = top;
		top = t;
	} 

	public T mypeek() {
		if (top == null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean myempty() {
		return top == null;
	}
	public int mymin() {
		if(!(min == null)){
		return (int)min.data;
		}
		return 0;
	}
}
