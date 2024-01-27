/*
question:
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/


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

//recursive solution with tc - o(m+n) and sc- O(max(M,n))
class Solution {
    static ListNode helper(ListNode node1, ListNode node2, int carry) {
        if (node1 == null && node2 == null && carry == 0) {
            return null;
        }
        int val1, val2;
        ListNode node1Next, node2Next;
        if (node1 == null) {
            val1 = 0;
            node1Next = null;
        } else {
            val1 = node1.val;
            node1Next = node1.next;
        }
        if (node2 == null) {
            val2 = 0;
            node2Next = null;
        } else {
            val2 = node2.val;
            node2Next = node2.next;
        }

        int sum1 = val1 + val2 + carry;
        ListNode finAns = new ListNode(sum1 % 10);

        finAns.next = helper(node1Next, node2Next, sum1 / 10);
        return finAns;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return helper(l1,l2,0);
        
    }
}

//iterative solution

