/*
    Time Complexity: O(N^2)
    Space Complexity: O(N),

*/
import java.util.Stack;

public class Solution {
	public static void sortedInsert(Stack<Integer> stack, int current) {
		if (stack.empty() == true || current > stack.peek()) {
			stack.push(current);
			return;
		}

		int top = stack.peek();
		stack.pop();
		sortedInsert(stack, current);
		// Insert the popped element back in the stack
		stack.push(top);
	}

	// Recursive method to sort a stack
	public static void sortStack(Stack<Integer> stack) {
		if (stack.empty() == true) {
			return;
		}

		// Remove the top element
		int top = stack.peek();
		stack.pop();
		sortStack(stack);
		sortedInsert(stack, top);
	}

}