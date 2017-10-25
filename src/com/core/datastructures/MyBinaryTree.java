package com.core.datastructures;

public class MyBinaryTree {

	MyBinaryTree leftNode;
	MyBinaryTree rightNode;
	int id;

	public MyBinaryTree(int i) {
		System.out.println("Creating Node : " + i);
		this.id = i;
		this.leftNode = null;
		this.rightNode = null;
	}

	public static void main(String[] args) {
		//int[] nums = { 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150 };
		int[] nums = {74, 41, 16, 53, 25, 46, 55, 42, 65, 70, 63, 64, 62} ;
		MyBinaryTree tree = new MyBinaryTree(60);

		for (int i : nums) {
			tree.addNode(i);
		}
		
		System.out.println("traversePreOrder");
		tree.traversePreOrder();
		System.out.println("\ntraverseInOrder");
		tree.traverseInOrder();
		System.out.println("\ntraversePostOrder");
		tree.traversePostOrder();
	}

	public void addNode(int i) {
		if (i < this.id) {
			if (this.leftNode != null) {
				this.leftNode.addNode(i);
			} else {
				this.leftNode = new MyBinaryTree(i);
			}
		} else if (i > this.id) {
			if (this.rightNode != null) {
				this.rightNode.addNode(i);
			} else {
				this.rightNode = new MyBinaryTree(i);
			}
		}
	}
	
	// Visit the node first, then left and right sub-trees
	public void traversePreOrder() {

		System.out.print(this.id+",");

		if (this.leftNode != null) {
			this.leftNode.traversePreOrder();
		}

		if (this.rightNode != null) {
			this.rightNode.traversePreOrder();
		}
	}

	// Visit left sub-tree, then node and then, right sub-tree
	public void traverseInOrder() {
		if (this.leftNode != null) {
			this.leftNode.traverseInOrder();
		}
		System.out.print(this.id+",");
		if (this.rightNode != null) {
			this.rightNode.traverseInOrder();
		}
	}

	// Visit left sub-tree, then right sub-tree and then the node
	public void traversePostOrder() {
		if (this.leftNode != null) {
			this.leftNode.traversePostOrder();
		}
		if (this.rightNode != null) {
			this.rightNode.traversePostOrder();
		}
		System.out.print(this.id+",");
	}

}
