package com.wyh.queue;

public class ArrayQueue<T> {
	private Object[] array;
	private int front = 0;
	private int rear = 0;

	public ArrayQueue(int length) {
		array = new Object[length];
	}

	public ArrayQueue() {
		// TODO Auto-generated constructor stub
	}

	public void push(T element) {
		array[rear] = element;
		rear++;
	}

	public void pop() {
		array[front++] = null;
	}

	public void print() {
		for (int i = front; i < rear; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue<String> aq = new ArrayQueue<String>(10);
		aq.push("as");
		aq.push("fy");
		aq.push("ff");
		aq.print();
		aq.pop();
		aq.print();
	}

}
