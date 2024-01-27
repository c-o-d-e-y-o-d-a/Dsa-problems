import java.util.*;

public class Solution {
    public static int uniqueSubstrings(String input) {
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int finalAns = 0;
        
        while (i < input.length()) {
            char a = input.charAt(i);
            if (!set.contains(a)) {
                set.add(a);
                finalAns = Math.max(finalAns, i-j+1);
                i++;
            } else {
               
                    char b = input.charAt(j);
                    set.remove(b);
                    j++;
                
            }
            
            
            
        }
        
        return finalAns;
    }
}
