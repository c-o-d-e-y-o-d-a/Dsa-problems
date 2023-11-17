// Next Greater Element coding ninja my code passes half the test cases 
import java.util.*;

public class Solution {

    public static int[] nextGreater(int[] arr, int n) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (s1.isEmpty()) {
                s1.push(arr[i]);
                s2.push(arr[i]);
            } else {
                int a = arr[i];
                if (a < s1.peek()) {
                    s2.push(s1.peek());
                } else if (a < s2.peek()) {
                    s2.push(s2.peek());
                } else {
                    s2.push(a);
                }

                s1.push(a);
            }
        }

        for (int i = 0; i < arr.length; i++) { // Fix: Change arr.length-1 to arr.length
            int a = s1.pop();
            int b = s2.pop();
            if (a == b) {
                arr[i] = -1;
            } else {
                arr[i] = Math.max(a, b);
            }
        }

        return arr;
    }

   
}