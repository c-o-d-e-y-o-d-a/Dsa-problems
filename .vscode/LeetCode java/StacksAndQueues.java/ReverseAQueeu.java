//using array , not - always store the size of the queueu / stack in the starting of the program bc their size changes if you remove or add elements, same can be said for linked lists

import java.util.* ;
import java.io.*; 

public class Solution {

    public static Queue<Integer> reverseQueue(Queue<Integer> q) {
    int n = q.size();
    if(n == 1)return q;
    int[] arr = new int[n];
    for(int i=n-1;i>=0;--i){
      arr[i] = q.peek();
      q.remove();
    }
    
    for(int i =0;i<n;i++){
      q.add(arr[i]);
    }
    return q;
      
    }
  }

  //using stack-

  import java.util.* ;
import java.io.*; 

public class Solution {

    public static Queue<Integer> reverseQueue(Queue<Integer> q) {
      Stack<Integer> s1 = new Stack<Integer>();
      int n = q.size();
      for(int i=0;i<n;i++){
        s1.push(q.peek());
        q.remove();
      }
      for(int i=0;i<n;i++){
        q.add(s1.peek());
        s1.pop();
      }
      return q;
      
      
    }
  }

  //using another queue tc - O(n*n) rest have tc - O(N)
  mport java.util.Queue;
import java.util.LinkedList;

public class Solution 
{
    public static Queue < Integer > reverseQueue(Queue < Integer > q) 
    {	
        // Maintain a queue
        Queue < Integer > ans = new LinkedList < Integer > ();

        while (!q.isEmpty()) 
        {
            int n = q.size();

            // Remove the top n-1 elements.
            for (int i = 1; i <= n - 1; i++) 
            {
                q.add(q.peek());
                q.remove();
            }
			
            // Insert the front element of q into ans
            ans.add(q.peek());
            q.remove();
        }
		
        // Return the queue containing elements in reverse order
        return ans;
    }
}
