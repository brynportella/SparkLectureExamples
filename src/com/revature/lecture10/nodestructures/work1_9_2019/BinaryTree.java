package com.revature.lecture10.nodestructures.work1_9_2019;

public class BinaryTree {
	Node top;
	
	public BinaryTree() {
	}
	
	public void add(Integer i) {
		Node traverser = top;
		if (traverser == null) {
			top = new Node(i);
		}else {
			Integer data = traverser.getData();
			if(i< data) {
				addLeft(traverser, traverser.left, i);
			}else {
				addRight(traverser, traverser.right, i);
			}
		}
	}
	
	public void addLeft(Node parent, Node child, Integer i) {
		if(child == null) {
			parent.setLeft( new Node(i));
		}
		else {
			if(i<child.data) {
				addLeft(child, child.left, i);
			}else {
				addRight( child, child.right, i);
			}
		}
	}
	
	public void addRight(Node parent, Node child, Integer i) {
		if(child == null) {
			parent.setRight(new Node(i));
		}
		else {
			if(i<child.data) {
				addLeft(child, child.left, i);
			}else {
				addRight( child, child.right, i);
			}
		}
	}
	
	
	public void printTree() {
		recursivePrint(top);
	}
	
	public void recursivePrint(Node n) {
		if(n == null) {
			return;
		}
		
		System.out.println(n);
		recursivePrint(n.getLeft());
		recursivePrint(n.getRight());
		
	}
	
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		b.add(5);
		b.add(3);
		b.add(8);
		b.add(6);
		b.add(2);
		b.add(4);
		b.printTree();
	}
}
