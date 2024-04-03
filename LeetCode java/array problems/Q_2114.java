/*2114. Maximum Number of Words Found in Sentences
Easy
1.4K
48
Companies
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.

 

Example 1:

Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a singl */

class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxValue = 0;
        for(int i=0;i<sentences.length;i++){
            String sentence = sentences[i];
            String[] arr = sentence.split(" ");
            int currentLen = arr.length;
            if(currentLen > maxValue){
                maxValue = currentLen;
            }

        }
        return maxValue;
    }
} 

// tc - O(n)  sc -O(n)
//how it works , gets each string in the input array , seperates it by space using split and stores that in an array and 
// fin the length of new array and see if its greater than the biggst value found so far