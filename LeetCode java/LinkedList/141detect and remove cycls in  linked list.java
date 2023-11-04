
// Given head, the head of a linked list, determine if the linked list has a cycle in it.

// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

// Return true if there is a cycle in the linked list. Otherwise, return false.

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