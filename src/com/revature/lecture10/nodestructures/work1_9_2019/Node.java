package com.revature.lecture10.nodestructures.work1_9_2019;

public class Node {
	Integer data;
	Node left;
	Node right;
	
	public Node() {}
	
	//Constructor That takes in Data
	public Node(Integer data) {
		this.data = data;
	}
	

	public void setData(Integer data) {
		this.data = data;
	}
	
	public Integer getData() {
		return data;
	}
	
	//Set left with a node
	public void setLeft(Node left) {
		this.left = left;
	}
	
	//set left with just a data value 
	public void setLeft(Integer i) {
		this.left = new Node(i);
	}
	
	public Node getLeft() {
		return left;
	}
	
	//set right with a Node 
	public void setRight(Node right) {
		this.right = right;
	}
	
	//set right with just the data value 
	public void setRight(Integer i) {
		right = new Node(i);
	}
	
	public Node getRight() {
		return right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
}
