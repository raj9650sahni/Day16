package com.stack;
import com.lnkedlistMain.LinkedList;
import com.node.Node;

public class Stack {
	
	private LinkedList l = new LinkedList();
	
	public void push(int d) {
		l.insert1(d);
		
	}
	
	public void pop() {
		l.deleteAtLast();
	}
	
	public int peek() {
		return l.peek();
		
		
	}
	
	public void sizeStack() {
		l.size();
		
	}
	
	public void showStack() {
		l.show();
	}
	

	
	public static void main(String[] args) {
		Stack s =new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.showStack();
	}


}
