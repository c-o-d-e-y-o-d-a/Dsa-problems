
// Given head, the head of a linked list, determine if the linked list has a cycle in it.

// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

// Return true if there is a cycle in the linked list. Otherwise, return false.

//tc of this code - o(N) and sc - O(N)

import java.util.*;

public class Solution {
 
  public static Node removeLoop(Node head) {
    
    HashSet<Node> container = new HashSet<Node>();
    Node prev = null;
    Node curr = head;
    while(curr!=null){
      if(container.contains(curr)){
        prev.next = null;
        return head;
      }
      else{
        container.add(curr);
        prev = curr;
      }
      curr = curr.next;

      
    }
    return head;
   
  }
}

//above mthod uses hashmap to store each node that was previously visited , if node exits in the hashmap that means it was already previously visited by us 


//tc - O(N) and sc - O(1)

import java.util.*;
public class Solution {
    public static Node removeLoop(Node head) {
        Node fast = head;
        Node slow = head;
        boolean ifLoopExists = false;

        // Detect the loop using Floyd's cycle detection algorithm
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ifLoopExists = true;
                break;
            }
        }

        if (ifLoopExists) {
            // Reset one of the pointers to the head and move them at the same pace
            fast = head;
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            Node start = slow;
            Node cur = start;
            while(true){
              if(cur.next==start){
                cur.next=null;
                break;
                
              }
              cur = cur.next;
            }

           
        }
        

        return head;
    }
}
