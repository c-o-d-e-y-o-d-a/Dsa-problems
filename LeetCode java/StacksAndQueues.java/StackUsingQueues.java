// using two queues : 
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