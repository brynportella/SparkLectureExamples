package com.revature.lecture11.linkedlist;

public class Node<T> {
	T data;
	Node<T> next;
	
	public Node() {}
	
	public Node(T data){
		this.data = data;
	}
	public Node<T> getNext(){
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public boolean hasNext() {
		return next != null? true : false;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
}
