package com.revature.lecture10.nodestructures.work1_9_2019;

public class BinaryTree {
	Node top;
	
	public BinaryTree() {
	}
	
	
	//add an integer to the tree
	public void add(Integer i) {
		Node traverser = top;
		//if the tree is empty create the top node
		if (traverser == null) {
			top = new Node(i);
		}else {
			//otherwise see if the data should be added to the left or right
			Integer data = traverser.getData();
			if(i< data) {
				addLeft(traverser, traverser.left, i);
			}else {
				addRight(traverser, traverser.right, i);
			}
		}
	}
	
	
	
	//to add it to the left we have this recursive method   
	public void addLeft(Node parent, Node child, Integer i) {
		//base case if the left child is null set it as the left node
		if(child == null) {
			parent.setLeft( new Node(i));
		}
		else {
			//otherwise determine if the data should be added to the child's left or right
			//call the method recursively depending on which side
			if(i<child.data) {
				addLeft(child, child.left, i);
			}else {
				addRight( child, child.right, i);
			}
		}
	}
	
	//to add it to the right we have this recursive method  
	public void addRight(Node parent, Node child, Integer i) {
		//base case if the right child is null set it as the right node
		if(child == null) {
			parent.setRight(new Node(i));
		}
		else {
			//otherwise determine if the data should be added to the child's left or right
			//call the method recursively depending on which side
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
		//print in a in-order traversal
		recursivePrint(n.getLeft());
		System.out.println(n);
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
