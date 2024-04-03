/* easy problem 
time compl - O(n) space compl - O(1)


Question -- 

Return the minimum number of moves required to make s valid.

 

Example 1:

Input: s = "())"
Output: 1
Example 2:

Input: s = "((("
Output: 3
Runtime
Details
-ms
Beats 100.00%of users with Java
Memory
Details
40.43mb
Beats 80.99%of users with Java
 */

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minAddToMakeValid(String pattern) {
        int finalAns = 0;
        int balance = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance == -1) {
                finalAns++;
                balance = 0;
            }
        }
        finalAns += balance;
        return finalAns;
    }
}