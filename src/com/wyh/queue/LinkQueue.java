package com.wyh.queue;

public class LinkQueue<T> {
	private class Node {
		private Node next;
		private T data;

		public Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node front;
	private Node rear;
	private int size = 0;

	public LinkQueue() {
		front = null;
		rear = null;
	}

	public void push(T element) {
		if (front == null) {
			front = new Node(element, null);
			rear = front;
		} else {
			Node node = new Node(element, null);
			rear.next = node;
			rear = node;
		}
		size++;
	}

	public void pop() {
		Node node = front;
		front = front.next;
		node.next = null;
		size--;
	}

	public void print() {
		for (Node node = front; node != null; node = node.next) {
			System.out.print(node.data + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkQueue<String> lq = new LinkQueue<String>();
		lq.push("ad");
		lq.push("cx");
		lq.push("po");
		lq.print();
		lq.pop();
		lq.print();
	}

}
