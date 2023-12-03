//brute force approach

import java.util.*;

public class Solution {
    public static double median(int[] a, int[] b) {
    	ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            ans.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            ans.add(b[i]);
        }
        Collections.sort(ans);
        if(ans.size() % 2 != 0){
            return (double) ans.get(ans.size()/2);
        }
        else{
            return (double) (ans.get(ans.size()/2) + ans.get((ans.size()/2)-1))/2;
        }
    }
}