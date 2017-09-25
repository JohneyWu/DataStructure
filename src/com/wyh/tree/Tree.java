package com.wyh.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {
	public class Node {

		private Node left;
		private Node right;
		private int data;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public Node root = null;

	public Tree() {

	}

	public void build(Node node, int data) {
		if (root == null) {
			root = new Node(data);
		} else {
			if (data < node.data) {
				if (node.left == null) {
					node.left = new Node(data);
				} else {
					build(node.left, data);
				}
			} else {
				if (node.right == null) {
					node.right = new Node(data);
				} else {
					build(node.right, data);
				}
			}
		}
	}

	public void PreOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			PreOrder(root.left);
			PreOrder(root.right);
		}
	}

	public void PreOrderStack(Node root) {
		if (root == null)
			return;
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node temp = stack.pop();
			System.out.print(temp.data + " ");
			if (temp.right != null)
				stack.push(temp.right);
			if (temp.left != null)
				stack.push(temp.left);
		}
	}

	public void InOrder(Node root) {
		if (root != null) {
			InOrder(root.left);
			System.out.print(root.data + " ");
			InOrder(root.right);
		}
	}

	public void InOrderStack(Node root) {
		Stack<Node> stack = new Stack<Node>();
		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			if (!stack.isEmpty()) {
				root = stack.pop();
				System.out.print(root.data + " ");
				root = root.right;
			}
		}
	}

	public void PostOrder(Node root) {
		if (root != null) {
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.print(root.data + " ");
		}
	}

	public void PostOrderStack(Node root) {
		Stack<Node> stack = new Stack<Node>();
		Node q = root;
		while (root != null) {
			while (root.left != null) {
				stack.push(root);
				root = root.left;
			}
			while (root != null && (root.right == null || root.right == q)) {
				System.out.print(root.data + " ");
				q = root;
				if (stack.isEmpty())
					return;
				root = stack.pop();
			}
			stack.push(root);

			root = root.right;
		}
	}

	public void levelOrder(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.poll();
			System.out.print(temp.data + " ");
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}
	}
	
	public void levelOrderArrayList(Node root){
		ArrayList<Node> list =  new ArrayList<Node>();
		list.add(root);
		int cur = 0;
        int last = 1;
        while(cur < list.size()){        
            last = list.size();        
            while(cur < last){           
                System.out.print(list.get(cur).data+" ");
                if(list.get(cur).left != null){
                    list.add(list.get(cur).left);
                }
                if(list.get(cur).right != null){
                    list.add(list.get(cur).right);
                }
                cur++;
            }
        }
		
	}

}
