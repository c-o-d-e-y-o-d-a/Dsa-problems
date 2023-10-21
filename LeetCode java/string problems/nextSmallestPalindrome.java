/* 
the brute way to solve this problem includes increasing the number by 1 and then checking if its a palindrome and
returning it if it is, but this is the not he best solution 

the better solution is what makes it hard , the trick is quite simple , 

There are 2 possible scenarios - 
1-  the string is all 9s
2- the string some other number

for the 1st case we just add 2 to the number to get the next smallest palindrome - ex - 99+1 = 101 and so on


for the 2nd case, its a bit more tricky, 
there are 2 possible scnearios now , either the string has odd length or even length
for odd length - 

we divide the string from the middle element and then reverse the left side and compare that reversed version with the normal right side
now there will be 2 possible scenarios either the left side is bigger or its not 
if its bigger after reversing than we just return left side + middle element + reverse of left side
if its smaller than we take the left side along with the middle element as a int and and add  to that integer
after adding 1 we will again take the left hand side of the middle value (which has changed now) and reverse it and return
left side + middle element + reverse of left side



for even length- 
you take the left side and compare it with the right side (both are of equal length) if the reverseof left side is greater than 
the right side then you return leftside + reverseOfLeftSide 

if its not then you add 1 to the int version of left side and return 
leftside + reverseOfLeftSide 
  
 */
import java.util.* ;
import java.io.*; 

public class Solution {
    public static String getNextLargestPalindrome(String number, int length) {
        StringBuilder answer = new StringBuilder();
        String leftSide = number.substring(0, length / 2);
        String middle = "";
        String rightSide = "";
		if(!for(int i=0;i<number.length;i++){
			if(number.charAt(i)=='9'){
				return false;
			}
			return true;
		}){
			return Integer.toString(Integer.parseInt(number)+2);
		}

        if (length % 2 != 0) {
            middle = Character.toString(number.charAt(length / 2));
            rightSide = number.substring(length / 2 + 1, length);
        } else {
            rightSide = number.substring(length / 2, length);
        }

        StringBuilder builder = new StringBuilder(leftSide);
        String reversedLeftSide = builder.reverse().toString();

        if (Integer.parseInt(reversedLeftSide) > Integer.parseInt(rightSide)) {
            answer.append(leftSide);
            answer.append(middle);
            answer.append(reversedLeftSide);
            return answer.toString();
        } else {
            int leftAndMiddleInt = Integer.parseInt(leftSide + middle) + 1;
            String leftAndMiddle = Integer.toString(leftAndMiddleInt);

            if (length % 2 != 0) {
                leftSide = leftAndMiddle.substring(0, length / 2);
                middle = Character.toString(leftAndMiddle.charAt(length / 2));
            } else {
                leftSide = leftAndMiddle;
            }

            builder = new StringBuilder(leftSide);
            reversedLeftSide = builder.reverse().toString();

            answer.append(leftSide);
            answer.append(middle);
            answer.append(reversedLeftSide);

            return answer.toString();
        }
    }

    public static String nextLargestPalindrome(String number, int length) {
        return getNextLargestPalindrome(number, length);
    }
}
 //code i wrote today , will complete the code for the question tommorow 
 //updated code  , still not complete