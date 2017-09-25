package com.wyh.stack;

public class ArrayStack<T> {
	private int size = 0;
	private Object[] array;

	public ArrayStack(int length) {
		array = new Object[length];
	}

	public ArrayStack() {
		// TODO Auto-generated constructor stub
	}

	public void push(T element) {
		array[size] = element;
		size++;
	}

	public void pop() {
		array[--size] = null;
	}

	public void print() {
		for (int i = size - 1; i > -1; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		ArrayStack<String> as = new ArrayStack<String>(10);
		as.push("as");
		as.push("fy");
		as.push("ff");
		as.print();
		as.pop();
		as.print();
	}
}
