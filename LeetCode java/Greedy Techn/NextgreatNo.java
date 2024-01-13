import java.util.Arrays;

public class Solution {

    // Function to swap two digit
    static void swap(char ar[], int i, int j) {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static String nextGreater(String str) {

        char S[] = str.toCharArray();
        int i = str.length() - 2;

        // Traversing from right to find the number x which is smaller than the next one
        for (; i >= 0; i--) {
            if (S[i] < S[i + 1]) {
                break;
            }
        }

        // If it doesn't exist, return -1
        if (i < 0) {
            return "-1";
        }

        // Finding the number x' in the right side which is just greater than x
        for (int j = S.length - 1; j > i; j--) {
            if (S[j] > S[i]) {
                swap(S, i, j);
                break;
            }
        }

        // Reversing the right side to make it in increasing order
        Arrays.sort(S, i + 1, S.length);
        return String.valueOf(S);
    }
}

//my sol - 
import java.util.Scanner;

public class Solution {
    
    public StringBuilder reverseString(String a, int s, int e) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s; i++) {
            ans.append(a.charAt(i));
        }
        for (int i = e; i >= s; i--) {
            ans.append(a.charAt(i));
        }
        return ans;
    }

    public String nextGreater(Scanner s) {
        String input = s.next();
        if (input.length() == 1) return input;

        int smallest = Integer.MAX_VALUE;
        int smallestInd = 0;
        int i = input.length() - 1;
        int ind = 0;

        while (i >= 0) {
            int a = input.charAt(i) - '0';
            if (a < smallest) {
                smallest = a;
                smallestInd = i;
            }

            if (i == input.length() - 1) {
                i--;
                continue;
            } else {
                if (a < input.charAt(i + 1) - '0') {
                    ind = i;
                    break;
                }
            }
            i--;
        }

        // Swapping the elements
        StringBuilder a = new StringBuilder();
        for (int j = 0; j < input.length(); j++) {
            if (j != smallestInd && j != ind) a.append(input.charAt(j));
            else if (j == ind) {
                a.append(input.charAt(smallestInd));
            } else if (j == smallestInd) {
                a.append(input.charAt(ind));
            }
        }

        StringBuilder ans = reverseString(a.toString(), ind + 1, a.length() - 1);
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println(solution.nextGreater(scanner));
        scanner.close();
    }
}
