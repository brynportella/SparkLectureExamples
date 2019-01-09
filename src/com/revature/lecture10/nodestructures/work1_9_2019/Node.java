package com.revature.lecture10.nodestructures.work1_9_2019;

public class Node {
	Integer data;
	Node left;
	Node right;
	boolean hasChildren;
	
	public Node() {}
	
	//Constructor That takes in Data
	public Node(Integer data) {
		this.data = data;
		hasChildren = false;
	}
	
	//Setter for the Data 
	public void setData(Integer data) {
		this.data = data;
	}
	
	public Integer getData() {
		return data;
	}
	
	//Setter for the left child
	
	public void setLeft(Node left) {
		hasChildren = true;
		this.left = left;
	}
	
	public void setLeft(Integer i) {
		hasChildren = true;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public void setRight(Node right) {
		this.right = right;
		hasChildren = true;
	}
	
	public void setRight(Integer i) {
		right = new Node(i);
		hasChildren = true;
	}
	
	public Node getRight() {
		return right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
}
