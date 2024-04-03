my code 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static void insertInSortedArray(ListNode head, ListNode sortedTail, ListNode temp) {
        ListNode pointer = head;
        while (pointer != sortedTail) {
            if (pointer.next.val >= temp.val) {
                break;
            }
            pointer = pointer.next;
        }
        ListNode a = pointer.next;
        pointer.next = temp;
        temp.next = a;
    }
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = head.next;
        ListNode sortedtail = head;
        while (temp != null) {
            if (temp.val >= sortedtail.val) {
                sortedtail = temp;
                temp = temp.next;
                continue;
            }
            sortedtail.next = temp.next;
            insertInSortedArray(head, sortedtail, temp);
            temp = sortedtail.next;
        }
        return head;

        
    }
} //gives TLE


// official code

/*
	Time Complexity : O(N^2)
	Space Complexity : O(1)

	where 'N' is the number of nodes in the list
*/

public class Solution
{
// Function to insert an element at its correct position in sorted order.
public static Node sortedInsert(Node head, Node newnode)
    {

        Node current;

        if (head == null || ((head).data >= newnode.data))
        {
            newnode.next = head;
            head = newnode;
        }

        else
        {
            current = head;
            while (current.next != null && current.next.data < newnode.data)
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }

        return head;
    }
    
public static Node insertionSortLL(Node head)
    {
        // To store the final sorted list
        Node sorted = null;

        // Current pointer, to iterate over the entire list
        Node current = head;

        /* 
	    This loops takes each element in the loop and calls sortedInsert function for it, 
	    to insert it at its correct position in the final list
	    */
        while (current != null)
        {
            Node next = current.next;
            sorted = sortedInsert(sorted, current);
            current = next;
        }

        return sorted;
    }
}
