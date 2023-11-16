// using two queues : , all we got to do  is to reverse the main queue to make it function like a stack.
import java.util.*;

public class Solution {
    static class Stack {
        Queue<Integer> q1;
        Queue<Integer> q2;

        public Stack() {
            this.q1 = new LinkedList<>();
            this.q2 = new LinkedList<>();
        }

        /*----------------- Public Functions of Stack -----------------*/

        public int getSize() {
            return this.q1.size();
        }

        public boolean isEmpty() {
            return this.q1.isEmpty();
        }

        public void push(int element) {
            while (!this.q1.isEmpty()) {
                this.q2.add(this.q1.poll());//use in built methods of the queue classs to check if empty or not instead of using the size property , its unecessary and creates problems
            }
            this.q1.add(element);
            while (!this.q2.isEmpty()) {
                this.q1.add(this.q2.poll());
            }
        }

        public int pop() {
            if (isEmpty()) return -1;
            return this.q1.poll();
        }

        public int top() {
            if (isEmpty()) return -1;
            return this.q1.peek();
        }
    }
}

//doing the same with a single queue
import java.util.*;
public class Solution{
    static class Stack {
        Queue<Integer> q1;

        public Stack() {
            q1 = new LinkedList<Integer>();
        }

        /*----------------- Public Functions of Stack -----------------*/

        public int getSize() {
            return this.q1.size();
        }

        public boolean isEmpty() {
            return this.q1.isEmpty();
        }

        public void push(int element) {
            if(this.q1.isEmpty()){
                this.q1.add(element);
            }
            else{
                int n = this.q1.size();
                this.q1.add(element);
                for(int i =0;i<n;i++){
                    this.q1.add(this.q1.peek());
                    this.q1.poll();

                }
            }

            
        }//we use this for loop to iterate over the element

        public int pop() {
            if(!this.q1.isEmpty()){
                return this.q1.poll();


            }
            else{return -1;}
        }

        public int top() {
            if(!this.q1.isEmpty()){
                return this.q1.peek();
            }
            else{return -1;}
        }
    }
}