import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{	public static LinkedListNode<Integer> helper(LinkedListNode current,LinkedListNode currentNext){
		if(current == null || current.next==null || currentNext==null){
			return current;

		}
		Node a = currentNext.next;
		currentNext.next = current;
		return(helper(currentNext,a));


		

}
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {	
		if(head == null)return head;
		if(head.next == null)return head;
        Node current = head;
		Node currentNext = head.next;
		current.next=null;
		currentNext2 = currentNext.next;
		currentNext.next = current;
		return helper(currentNext,currentNext2);
		
    }
}


// most optimised solution 
O(n) : tc and sc : O(1)

import java.io.*;
import java.util.* ;

	
/*	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{	
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {	
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> curr = head;

		while(curr != null){
			LinkedListNode<Integer> nextNode = curr.next;
			curr.next=prev;
			prev = curr;
			curr = nextNode;

		}
		return prev;

		
    }
}

// basiclly store two vars current and next and put next value of current = previous linked list and , prev becomes curr bc you need to move to next element, so it will become the previous element and then to acutally move to the next node you make curr = nextNode(where you stored the old next value of current element)