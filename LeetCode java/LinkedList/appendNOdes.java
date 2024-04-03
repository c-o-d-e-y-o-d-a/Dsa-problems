import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class Node<Integer>
    {
        int data;
        Node<Integer> next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

 *****************************************************************/
public class Solution {
    public static Node<Integer> addNodes(Node<Integer> head, int n, int m) {
        boolean ifSkip = false; // Start with ifSkip as false
        int sum = 0;
        Node<Integer> pointer = head;

        while (pointer.data != -1)  {
            if (ifSkip) {
                for (int i = 0; i < m-1 && pointer.data != -1; i++) {
                    pointer = pointer.next;
                }
                ifSkip=false;
                
                
            } else {
                for (int i = 0; i < n-1 && pointer.data != -1; i++) {
                    
                    sum += pointer.data;
                    pointer = pointer.next;
                }
                 Node<Integer> newNode = new Node<Integer>(sum);
                if (pointer.data != -1) {
                    Node<Integer> temp = pointer.next;
                    pointer.next = newNode;
                    newNode.next = temp;
                }

                sum = 0;
                ifSkip = true;
                

               
            }

        }
        


        return head;
    }
}//my solution , gives null pointer d k why 


// official solution
Java (SE 1.8)
/*

    Time Complexity : O(N)
    Space Complexity : O(1)

    Where N denotes the length of linked list.

*/

public class Solution {

    public static Node<Integer> addNodes(Node<Integer> head, int n, int m) {

        // If the linked list is empty then return head as it is.
        if (head == null) {  
            return head;
        }

        // Variable tempsum to store the temporary sum.
        int tempsum = 0;  

        // Declaring temp node by which we will iterate through the linked list.
        Node<Integer> temp = head;
        boolean turnN = false;
        int countN = 0, countM = 0;   

        // Iterating through the linked list till the end.  
        while (temp.next != null) { 

            // If turnN is true then increment N as at that time N iterations are made for sum calculation. 
            if (turnN) { 

                // Add the value of the current node to the tempsum and increment the value of countN.            
                tempsum += temp.data;
                countN++;

                // Append sum of N nodes to the linked list if N nodes are iterated and set turnN as false as now M iterations are to be made.
                if (countN == n) {  
                    Node<Integer> newnode = new Node(tempsum);
                    newnode.next = temp.next;
                    temp.next = newnode;
                    tempsum = 0;
                    countN = 0;
                    temp = temp.next;
                    turnN = false;
                }
            } 
            else { 
                // Increment countM if currently M iterations for skipping the nodes are made.
                countM++;

                // If countM reaches M then set again turnN to true and make countM as zero.
                if (countM == m) {
                    turnN = true;
                    countM = 0;
                }
            }

            temp = temp.next;
        }

        // If after iterating the linked list, at last N iterations for sum were to be made then append the temporary sum to end of the linked list.
        if (turnN) {  
            countN++;
        }
        if (countN != 0) {  
            tempsum += temp.data;
            Node<Integer> newnode = new Node(tempsum);
            temp.next = newnode;
        }

        // Return the head of the linked list.
        return head;  
    }
}