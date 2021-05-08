package com.queue;

import com.lnkedlistMain.LinkedList;

public class Queue {
	
private LinkedList l = new LinkedList();
	
	public void push(int d) {
		l.insert1(d);
		
	}
	
	public void pop() {
		l.deleteAtfirst();
	}
	
	public int peek() {
		return l.peek();
		
		
	}
	
	public void sizeQueue() {
		l.size();
		
	}
	
	public void showQueue() {
		l.show();
	}
	

	
	public static void main(String[] args) {
		Queue q =new Queue();
		q.push(10);
		q.push(20);
		q.push(30);
		
		q.pop();
		q.showQueue();
		
	}

}
