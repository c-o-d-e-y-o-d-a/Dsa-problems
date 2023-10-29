find the middle element in linked list - question
brute forcd , go over the ll and find the length of LL and then iterate over and reuturn the n/2 element .

optimised: do this in a single loop 


/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution
{
    public static Node findMiddle(Node head)
    {
        if(head == null)return head;
        if(head.next == null)return head;
        Node point1 = head;
        Node point2 = head;
        while(point1 != null && point1.next != null){
            point1 = point1.next.next;
            point2 = point2.next;
        }
        return point2;
    }
}