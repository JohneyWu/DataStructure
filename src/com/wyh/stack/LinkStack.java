package com.wyh.stack;

public class LinkStack<T> {
	private class Node {
		private Node next;
		private T data;

		public Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node top;
	private int size = 0;

	public LinkStack() {
		top = null;
	}

	public void push(T element) {
		top = new Node(element, top);
		size++;
	}

	public void pop() {
		Node node = top;
		top = top.next;
		node.next = null;
		size--;
	}

	public void print() {
		for (Node node = top; node != null; node = node.next) {
			System.out.print(node.data + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		LinkStack<String> ls = new LinkStack<String>();
		ls.push("ad");
		ls.push("cx");
		ls.push("po");
		ls.print();
		ls.pop();
		ls.print();
	}

}
