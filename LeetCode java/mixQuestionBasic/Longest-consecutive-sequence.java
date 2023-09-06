//in O(n) time and space

import java.util.*;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        if (N == 0) return 0; // Handle empty array
        
        Set<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }
        
        int longestSeq = 0;
        
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) { // Check if num is the start of a sequence
                int currentNum = num;
                int currentSeq = 1;
                
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSeq++;
                }
                
                longestSeq = Math.max(longestSeq, currentSeq);
            }
        }
        
        return longestSeq;
    }
}
