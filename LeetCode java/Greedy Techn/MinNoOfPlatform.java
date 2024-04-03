// tc - n lon sc - O(1)
import java.util.*;
//basically calculates max no of trains with overlapping time

public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        Arrays.sort(at);
        Arrays.sort(dt);
        int i = 0;
        int j = 0;
        int count = 0;
        int max = 0;

        while(i<at.length){
            if(at[i]<=dt[j]){
                count++;
                max = Math.max(max,count);
                i++;

            }
            else if(at[i]>dt[j]){
                count--;
                j++;
            }

        }
        return max;


    }
}


// optimised solution-
import java.util.*;


public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        int[] platforms = new int[2361];
        int ans = 1;
        Arrays.fill(platforms,0);
        for(int i=0;i<n;i++){
            ++platforms[at[i]];
            --platforms[dt[i]+1];
        }
        
        for(int i=1;i<2361;i++){
            platforms[i] = platforms[i] + platforms[i-1];
            ans = Math.max(ans,platforms[i]);
        }
        return ans;
    }
}