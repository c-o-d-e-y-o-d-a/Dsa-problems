import java.util.*;

class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    

    MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        
    }

    void push(int num) {
        this.s1.push(num);
        if(this.s2.isEmpty() || this.s2.peek()>=num){
            this.s2.push(num);
        }
    }

   void pop() {
    if (!s1.isEmpty()) {
        if (s1.peek().equals(s2.peek())) {
            s2.pop();
        }
        s1.pop();
    }
}


    // Function to return the top element of stack if it is present. Otherwise
    // return -1.
    int top() {
        return this.s1.isEmpty() ? -1 : this.s1.peek();
    }

    
    int getMin() {
        return this.s1.isEmpty() ? -1 : this.s2.peek();
    }
}
