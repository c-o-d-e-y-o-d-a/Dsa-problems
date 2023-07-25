/*

aabbc
abcd
abbdcaas
Sample Output 1 :
a2b2c1
a1b1c1d1
a1b2d1c1a2s1

 */



/*
 the question was easy but i struggles with chars and strings and concatinating them and stuff,
one other problem i faced at the time was that the concatination was not working for the last character in the string
the solutin to that was to add the val of character and its count once again after the for loop ends
 */

/* 
This problem would not be solved using normal strings , you need to use string builder class because its much faster 
because with normal strings a new string has to be created every time something is added because they are immutable
but stringBuilders are mutable and hence , MUCH FASTER
 */

/*

runtime -You performed better than-You performed better than
12.57%
20.88%

memory
 */

import java.util.* ;
import java.io.*; 
public class Solution {
	public static String encode(String message) {
		StringBuilder ansString = new StringBuilder();
		char current = message.charAt(0);
		int noOfLetter = 1;
		for(int i=1;i<message.length();i++){
			if(message.charAt(i) == current){
				noOfLetter++;
			}
			
			else{
				ansString.append(""+current);
				ansString.append(noOfLetter);
				current = message.charAt(i);
				noOfLetter = 1;
				

				
			}

		}
		ansString.append(""+current);
		ansString.append(noOfLetter);
		return ansString.toString();
		
	}
}