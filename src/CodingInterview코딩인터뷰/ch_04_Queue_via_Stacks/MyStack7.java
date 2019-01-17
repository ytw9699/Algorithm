package ch_04_Queue_via_Stacks;
import java.util.LinkedList;

public class MyStack7 {//���� ��ũ�� ����Ʈ api ����2����� ť
	
	LinkedList firstStack;
	LinkedList secondStack;
	
	public MyStack7() {
		firstStack = new LinkedList();
		secondStack = new LinkedList();
	}
	private void shiftStacks() {
		if (secondStack.isEmpty()) { 
			while (!firstStack.isEmpty()) {
				secondStack.push(firstStack.pop());
			}
		}
	}
	public void offer(Object data) {
		firstStack.push(data);
	}
	public Object poll() {
		return secondStack.pop();
	}
	public Object peek() {
		return secondStack.peek();
		}
	
	public boolean isEmpty() {
		shiftStacks();
		return secondStack.isEmpty();
		}
}