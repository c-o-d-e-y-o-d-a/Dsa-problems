public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        Node pointer = head;
        int len = 0;
        while(pointer!=null && pointer.next!=null){
            len++;
            pointer=pointer.next;

        }
        pointer = head;
        int posFromStart = (len- K) ;
        len =0;
        while(pointer!=null && pointer.next!=null && len != posFromStart){
            pointer = pointer.next;
            len++;
            

        }
        pointer.next = pointer.next.next;
        return head;


    }
} // passes 48/50 test cases on coding ninjas





//solution using two pointers , passes all test cases  , you take two pointers one slow and the other one fast, and maintain a gap of k between them , when fast reaches last , slow will be k nodes apart from the fast(last one)node

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

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        if(head == null || K==0){return head;}



        Node fastPointer = head;
        Node slowPointer = head;
        int count = 1;
        for(int i =0;i<K;i++){
            if(fastPointer.next==null){
                Node next = head.next;
                head.next = null;//if K equals the head of the LL - base case
                head = next;
                return head;
            }
            else{
                fastPointer=fastPointer.next;
            }
        }
        while(fastPointer.next != null){
            fastPointer=fastPointer.next;
            slowPointer=slowPointer.next;
        }
        slowPointer.next = slowPointer.next.next;
        return head;



    }