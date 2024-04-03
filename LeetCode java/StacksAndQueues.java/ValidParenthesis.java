// my solution , passes all test cases 
// warning- take care of type conversion properly here 
//tc-O(N)-sc

import java.util.Stack;

public class Solution {
    public static boolean checkStack(Stack<Character> s, int decide) {
        char a, b;
        switch (decide) {
            case 0:
                a = '(';
                b = ')';
                break;

            case 1:
                a = '[';
                b = ']';
                break;

            case 2:
                a = '{';
                b = '}';
                break;

            default:
                return false; // Handle unknown decide value
        }

        int counter = 0;
        int finalAns = 0;
        while (!s.isEmpty()) {
            char temp = s.peek();
            if (temp == b) {
                counter--;
            } else {
                counter++;
            }
            if (counter == -1) {
                finalAns++;
                counter = 0;
            }

            s.pop();
        }
        finalAns = finalAns + counter;
        return finalAns == 0;
    }

    public static boolean isValidParenthesis(String s) {
        Stack<Character> s0 = new Stack<>();
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == ')') {
                s0.push(currentChar);
            } else if (currentChar == '[' || currentChar == ']') {
                s1.push(currentChar);
            } else if (currentChar == '{' || currentChar == '}') {
                s2.push(currentChar);
            }
        }

        return checkStack(s0, 0) && checkStack(s1, 1) && checkStack(s2, 2);
    }
}
