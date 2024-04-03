//implemented deque in java using Linked List , passes 9/11 test cases
import java.util.* ;
import java.io.*; 
class LLNode{
    int data;
    LLNode next;
    LLNode(int n){
        data = n;
        next = null;
    }
}
public class Deque 
{
    int len;
    LLNode head;
    LLNode tail;
    int counter;
    
    public Deque(int n) 
    {
        len = n;
        head = null;
        tail = null;
        counter = 0;
    }

    
    public boolean pushFront(int x) 
    {
        if(counter==len){return false;}

        if(head==null){
            LLNode a = new LLNode(x);
            head = a;
            tail = a;
            counter++;
        }
        else{
            LLNode a = new LLNode(x);
            a.next = head;
            head = a;
            counter++;
        }
        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
        if(counter==len){return false;}

        if(tail==null){
            LLNode a = new LLNode(x);
            head = a;
            tail = a;
            counter++;
        }
        else{
            LLNode a = new LLNode(x);
            tail.next = a;
            tail = a;
            counter++;
        }
        return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
        if(counter==0)return -1;
        LLNode temp;
        if(head.next == null){
            temp = head;
            head = null;
            counter--;
        }
        
        else{
             temp = head;
            head = head.next;
            temp.next = null;
            counter--;
        }
        return temp.data;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        if(tail == null || counter==0)return -1;

        LLNode curr = head;
        LLNode lastNode = head;
        while(curr.next!=null){
            lastNode = curr;
            curr = curr.next;
        }
        lastNode.next = null;
        tail = lastNode;
        counter--;
        return curr.data;
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
        if(head == null || counter==0)return -1;
        else{
            return head.data;
        }
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
         if(tail == null || counter==0)return -1;
        else{
            return tail.data;
        }
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
        if(counter==0)return true;
        return false;
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        if(counter == len)return true;
        return false;
    }
}
