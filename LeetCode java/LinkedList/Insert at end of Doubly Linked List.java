/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node insertAtTail(Node list, int K) {
        
        Node a = new Node(K);
        if(list == null){
            return a;
        }
        if(list.next == null){
            list.next = a;
            a.prev = list;
        }
        Node curr = list;
        while(curr.next!=null){
            if(curr.next == null)break;
            curr = curr.next;
        }
        curr.next = a;
        a.prev = curr;
        return list;
    }
}