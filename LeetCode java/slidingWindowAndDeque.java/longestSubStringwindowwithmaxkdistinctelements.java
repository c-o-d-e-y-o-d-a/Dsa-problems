import java.util.*;

public class Solution {
    public static int getLengthofLongestSubstring(String s, int k) {
        HashMap<Character, Integer> tempSet = new HashMap<>();
        int windowStart = 0;
        int windowEnd = 0;
        int finalAns = 0;
        
        while (windowEnd < s.length()) {
            char endChar = s.charAt(windowEnd);
            tempSet.put(endChar, tempSet.getOrDefault(endChar, 0) + 1);
            
            while (tempSet.size() > k) {
                char startChar = s.charAt(windowStart);
                tempSet.put(startChar, tempSet.get(startChar) - 1);
                if (tempSet.get(startChar) == 0) {
                    tempSet.remove(startChar);
                }
                windowStart++;
            }
            
            finalAns = Math.max(finalAns, windowEnd - windowStart + 1);
            windowEnd++;
        }
        
        return finalAns;
    }
}
//learn how to use the getotdefault method properly