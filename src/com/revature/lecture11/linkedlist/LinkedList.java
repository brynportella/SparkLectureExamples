package com.revature.lecture11.linkedlist;

import java.util.List;

public class LinkedList<T>  {
	Node<T> head;
	
	public LinkedList(){}
	
	public void add(Node<T> nextNode) {
		if(head == null) {
			head = nextNode;
		}
		else {
			Node<T> runner = head;
			while(runner.hasNext()) {
				runner = runner.getNext();
			}
			runner.setNext(nextNode);
		}
	}
	
	public void add(T data) {
		Node<T> nextNode = new Node<>(data);
		if(head == null) {
			head = nextNode;
		}
		else {
			Node<T> runner = head;
			while(runner.hasNext()) {
				runner = runner.getNext();
			}
			runner.setNext(nextNode);
		}
	}
	
	public void print() {
		Node<T> runner = head; 
		while(runner != null) {
			System.out.println(runner);
			runner = runner.getNext();
		}
	}
}
