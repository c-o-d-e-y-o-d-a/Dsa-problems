import java.util.*;

class Queue {
    // Stacks to be used in the operations.
    Stack<Integer> stk1, stk2;

    public Queue() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }//there are initialised here instead of outside due to OOPs , bc if we were to initialise themoutside then these stacks will be resetted for every new object created

    public boolean enqueue(int x) {
        stk1.push(x);
        return true;
    }

    public int dequeue() {
        if (stk1.isEmpty()) return -1;
        
        while (!stk1.isEmpty()) {
            stk2.push(stk1.pop());
        }

        int ans = stk2.pop();

        while (!stk2.isEmpty()) {
            stk1.push(stk2.pop());
        }

        return ans;
    }
}
