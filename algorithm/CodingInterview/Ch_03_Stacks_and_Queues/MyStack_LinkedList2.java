package Ch_03_Stacks_and_Queues;

import java.util.EmptyStackException;

public class MyStack_LinkedList2<T> {
	
	
	private StackNode<T> top;
	private StackNode<T> min;//추가
	
	private static class StackNode<T> {
		private T data;
		private T minPrev;
		private StackNode<T> next;
		
		public StackNode(T data) {
			this.data = data;
		}
		
		public T getData() {
			return data;
		}
		public T getminPrev() {
			return minPrev;
		}
	}

	public T pop() {
		if (top == null) throw new EmptyStackException();
		T item = top.getData();
		
		if(!(top.getminPrev() == null)){
		min.data = top.getminPrev();
		}
		if(top.minPrev == null) {
			min = null;
		}
		top = top.next;
		
		return item;
	}

	public void push(T item) { 
		StackNode<T> t = new StackNode<T>(item);
		
		if(!(min == null)) {
		t.minPrev = min.data; 
		}		
		
		if(top == null || (int)t.data <= (int)min.data) {////추가
			min = t;
		}
		
		t.next = top;
		top = t;
	} 

	public T peek() {
		if (top == null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean empty() {
		return top == null;
	}
	public int min() {
		if(!(min == null)){
		return (int)min.data;
		}
		return 0;
	}
}
