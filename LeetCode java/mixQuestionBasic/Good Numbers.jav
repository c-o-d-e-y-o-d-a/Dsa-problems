/* Problem statement
A number is called good if it's every digit (except the rightmost digit) is larger than the sum of digits on the right side of that digit.



Find all the good numbers in the range from 'a' to 'b' (both inclusive), such that none of them contains 'digit' as a digit.



Example :
Input: 'a' = 840, 'b' = 850 and 'digit' = 6

Output: Good numbers = [840, 841, 842, 843, 850]

Explanation: Consider 841:
8 > (4 + 1)
4 > 1
Since each digit is greater than the sum of digits on right (except 1, which does not have any digit on its right), 841 is a good number. Similarly, all these numbers are good.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
840 850
6


Sample Output 1:
840 841 842 843 850


Explanation of sample input 1 :
Consider 841:
8 > (4 + 1)
4 > 1
Since each digit is greater than the sum of digits on right (except 1, which does not have any digit on its right), 841 is a good number. Similarly, all these numbers are good.


Sample Input 2:
20 45
1


Sample Output 2:
20 30 32 40 42 43


Explanation of sample input 2 :
The good numbers in this range are:
20 21 30 31 32 40 41 42 43

Among these, 21, 31 and 41 have digit 1 in them, so they are not included.


Expected time complexity :
The expected time complexity is O(b * log(b) - a * log(a)).


Constraints :
1 <= 'a' <= 'b' <= 10000
0 <= 'digit' <= 9

Time limit: 1 second
*/ 

// solution - 

import java.util.*;
public class Solution {
    static boolean ifValidFunc(int a,int digit){
        int sumTillNow = a % 10;
        int temp = a/10;
        int pass = 0;
        if(digit == sumTillNow)return false;
        while(temp != 0){
            int currDigit = temp % 10;
            if(currDigit == digit) return false;
            
            if(sumTillNow >= currDigit){
                return false;
            }
            sumTillNow += currDigit;
            
            temp = temp / 10;          
        }
        return true;



        
    }
    public static List< Integer > goodNumbers(int a, int b, int digit) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0;i<b - a + 1;i++){
            int num = a + i;
            boolean isValid = ifValidFunc(num,digit);
            if(isValid){
                ans.add(num);
            }

        }

        return ans;
        
    }
}