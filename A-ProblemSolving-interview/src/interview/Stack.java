package interview;

public class Stack {
	private int[] arr;
	private int capacity;
	private int top;

	public Stack(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
		this.top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public void push(int item) {
		if (isFull()) {
			throw new RuntimeException("stack is full");
		}
		arr[++top] = item;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("stack is empty");
		}
		return arr[top--];
	}

	public int peek() {
		return arr[top];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
