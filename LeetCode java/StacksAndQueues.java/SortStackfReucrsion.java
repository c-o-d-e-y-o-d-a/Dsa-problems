sort a stack using recursion only 
import java.util.* ;
import java.io.*; 
public class Solution {
	static void helper(int num,Stack<Integer> sortedStack){
		if(sortedStack.isEmpty() || num >= sortedStack.peek()){
			sortedStack.push(num);
			return;
		}
		int a  = sortedStack.pop();
		helper(num,sortedStack);
		sortedStack.push(a);


	}
	static void iterator(Stack<Integer> input,Stack<Integer> sortedStack){
		if(input.isEmpty())return;
		int a = input.pop();
		helper(a,sortedStack);
		iterator(input,sortedStack);
	}
	public static Stack<Integer> sortStack(Stack<Integer> s) {
		Stack<Integer> sortedStack = new Stack<Integer>();
		iterator(s,sortedStack);
		return sortedStack;

	}
}
