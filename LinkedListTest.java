package com.testmethod.linkedlist;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.lnkedlistMain.LinkedList;

import com.node.Node;

import junit.framework.Assert;


public class LinkedListTest {
	
	@Test
	public  void when_passed_return_true_or_false() {
		LinkedList l = new LinkedList();
		l.insert1(56);
		l.insert1(30);
		l.insert1(70);
		l.searchAny(30);
		assertEquals(30, l.searchAny(30));
		System.out.println("Searched no. is 30 " + " and result is " + l.searchAny(30));
		
	}
	
	
	@Test 
	public void when_Inserted_Return_true_or_False() {
		
		LinkedList l = new LinkedList();
		l.insert1(56);
		l.insert1(30);
		l.insert1(70);
		l.insertAtAnyLocation(1, 40);
		assertEquals(40,l.searchAny(40));
		
		
	}
	
	@Test
	public void size_different_when_deleted()  {
		LinkedList l = new LinkedList();
		l.insert1(56);
		l.insert1(30);
		l.insert1(70);
		l.insertAtAnyLocation(1, 40);
		int prev= l.size();
		l.deleteAt(2);
		int ans = l.size();
		
		try {
		
			assertEquals(prev,ans);
		}
		catch (Exception e) {
			System.out.println("list size is different after insertion and deletion");
		
		}	
		
	}
	
	
	
	

}
