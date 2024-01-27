public class Solution {
    static class Stack {
        int cap;
        int topIndex = -1;
        int[] stackArr;

        Stack(int capacity) {
            cap = capacity;
            stackArr = new int[capacity];
        }

        public void push(int num) {
            if (topIndex < cap - 1) {
                topIndex++;
                stackArr[topIndex] = num;
            }
        }

        public int pop() {
            if (topIndex < 0) return -1;

            int retValue = stackArr[topIndex];
            topIndex--;

            return retValue;
        }

        public int top() {
            if (topIndex < 0) return -1;
            return stackArr[topIndex];
        }

        public int isEmpty() {
            if (topIndex < 0) return 1;
            return 0;
        }

        public int isFull() {
            if (topIndex == cap - 1) return 1;
            return 0;
        }
    }
}

//you bascially put and remove elements from an array only on one side and keep an pointer to store the top thats it