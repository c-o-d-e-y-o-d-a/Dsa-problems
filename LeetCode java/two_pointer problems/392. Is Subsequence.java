/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not

Time Complexity: O(max(s.length(), t.length()))
Space Complexity: O(1)

on leetcode - 
Runtime
Details
1ms
Beats 89.82%of users with Java
Memory
Details
40.60mb
Beats 52.70%of users with Java



on coding  ninjas - 
both better than 85% approxn


 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;
        int check = 0;
        while(tPointer<t.length() && sPointer<s.length()){
            if(s.charAt(sPointer)==(t.charAt(tPointer))){
                sPointer++;
                tPointer++;
                check++;

            }
            else{tPointer++;}
        }
        if(check==s.length()){
            return true;
        }
        else{return false;}
        
    }
}