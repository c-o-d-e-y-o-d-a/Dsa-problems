import java.util.* ;
import java.io.*; 
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

public class Queue {
    int size = 0;
    Node front = null;
    Node end = null;

    Queue() {
        
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        if(size < 1)return true;
        return false;
    }

    void enqueue(int data) {
        
        if(size<1){
            Node newNode = new Node(data);
            front = newNode;
            end = newNode;
        }
        else{
            Node newNode = new Node(data);
            end = newNode;

        }
        size++;
        
    }

    int dequeue() {
        if(size < 1)return -1;
        else{
            int retValue = front.data;
            front = front.next;
            size--;
            return retValue;
            
            
        }
        
        
    }

    int front() {
        if(size>0){
            return front.data;
        }
        else{return -1;}
    }

}