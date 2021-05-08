package com.lnkedlistMain;

import com.node.Node;

public class LinkedList {
	 Node head;

	public void insert1(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {

			Node n = head;
			while (n.next != null) {
				n = n.next;

			}
			n.next = node;
		}
	}

	// to print teh linked list

	public void show() {
		Node temp = head;
		System.out.println(head.data);
		while (temp.next != null) {
			System.out.println(temp.next.data);
			temp = temp.next;
		}
	}

	// insert elemnt at the start

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;

	}

	// insert elemnt at any index

	public void insertAtAnyLocation(int index, int data) {
		Node node = new Node();
		node.data=data;
		node.next = null;

		Node n = head;
		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}

	// insert elemnt after any node

	public void InsertAfterAnyNode(int d, int data) {
		Node node = new Node();
		node.next = null;
		node.data = data;

		Node n = head;

		while (n.next != null) {
			if (n.data == d) {
				node.next = n.next;
				n.next = node;
			} else {
				n = n.next;
			}
		}

	}

	// delete at any any index

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {

			Node n = head;
			Node temp = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}

			temp = n.next.next;
			n.next = temp;

		}

	}

	// search elemnt

	public int searchAny(int d) {
		Node n = head;
		int ans = 0;
		while (n != null) {
			if (n.data == d) {
				ans = n.data;
				
				
				break;
			} else {
				n = n.next;
			}
		}
		return ans;

	}
	
	//insert element at last

	public void insertAtLast(int data) {
		
		Node node = new Node();
		
		node.next = null;
		node.data = data;

		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;

	}
	
	
	//delete element at first

	public void deleteAtfirst() {
		int index = 0;
		if (index == 0) {
			head = head.next;
		}

	}

	    
	//delete element at last
	public void deleteAtLast() {
		int cnt = 0;
		Node p = head;
		while (p.next != null) {
			cnt += 1;
			p = p.next;

		}

		Node n = head;
		Node temp = null;
		for (int i = 0; i < cnt - 1; i++) {
			n = n.next;
		}

		temp = n.next.next;
		n.next = temp;
	}
	
	
	
	//linkedlist size

	public int size() {
		int cnt = 1;
		Node n = head;
		while (n.next != null) {
			cnt += 1;
			n = n.next;
		}
		return cnt;

	}
	
	
	public int peek() {
		Node n = head;
		while(n.next!=null) {
			n =n.next;
		}
		
		return n.data;
		
	}
	
	
	
	public void sortList()
    {
  
        // Node current will point to head
        Node current = head, 
        index = null;
  
        int temp;
  
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;
  
                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
  
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
	
	
	
}

	
	
