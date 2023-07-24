/* 
question -- 
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

ex - Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

space comp - O(n) time compl - O(n)


 */

class Solution {
    public String reverseWords(String s) {
        String sNew = s.trim();
        String answerString = "";
        String[] arr = sNew.split(" ");

        //if you put an + inside the split method then you won't need the if statement  in the loop because 
        //the + will also remove multiple white spaces
        for(int i=arr.length-1;i>=0;i--){//remember to include 0 when indexing backwards injava


            if(!(arr[i].equals("")) ){//this is the line where i got problem , after trimming the code
            //when there were mutliple spaces the split fuctions returns an empty string ,
            //i thougt that it will remove only the trailing spaces if there are 3 or more

                 answerString =answerString.concat(arr[i].trim()+" ");//also made an error in this line
                 //you can't modify strings and you need to do it like this
            }
            
           

        }
        return answerString.trim();

        
    }
}


// SOLUTION to beat more than 80% in both time and space

import java.util.*;

class Solution {
    public String reverseWords(String s) {
        int n = s.length(); // Get the length of the input string
        StringBuilder ans = new StringBuilder(); // Initialize a StringBuilder to store the reversed words
        int i = n - 1; // Start from the last character of the input string

        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--; // If the current character is a space, move to the next character
            } else {
                StringBuilder temp = new StringBuilder(" "); // Initialize a temporary StringBuilder with a space character
                int j = i;
                while (j >= 0 && s.charAt(j) != ' ') {
                    temp.append(s.charAt(j)); // Append each character to the temporary StringBuilder in reverse order
                    j--;
                }
                ans.append(temp.reverse()); // Reverse the characters in the temporary StringBuilder and append to the final StringBuilder
                i = j; // Update the index to continue from the next word
            }
        }

        ans.deleteCharAt(ans.length() - 1); // Remove the extra space character appended at the end

        return ans.toString(); // Return the reversed words as a string
    }
}