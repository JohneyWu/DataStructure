package com.wyh.tree;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Tree tree = new Tree();
        int[] a = {25,6,9,43,21,18,4};
        for(int i = 0;i<a.length;i++){
        	tree.build(tree.root,a[i]);
        }
        System.out.print("递归前序遍历:");
        tree.PreOrder(tree.root);
        System.out.println("");
        System.out.print("栈 前 序 遍 历 :");
        tree.PreOrderStack(tree.root);
        System.out.println("");
        System.out.print("递归中序遍历:");
        tree.InOrder(tree.root);
        System.out.println("");
        System.out.print("栈 中 序 遍 历 :");
        tree.InOrderStack(tree.root);
        System.out.println("");
        System.out.print("递归后序遍历:");
        tree.PostOrder(tree.root);
        System.out.println("");
        System.out.print("栈 后 序 遍 历 :");
        tree.PostOrderStack(tree.root);
        System.out.println("");
        System.out.print("队列层次遍历:");
        tree.levelOrder(tree.root);
        System.out.println("");
        System.out.print("数组层次遍历:");
        tree.levelOrderArrayList(tree.root);
        System.out.println("");
	}

}
