import java.util.*;
public class Solution {
    public static int assignCookie(int []greed, int []size) {
       int ans = 0;
       int pointer1 = 0;
       int pointer2 = 0;
       Arrays.sort(greed);
       Arrays.sort(size);
       while(pointer1 < greed.length && pointer2 < size.length ){
           if(greed[pointer1]<=size[pointer2]){
               pointer1++;
               pointer2++;
               ans++;
           }
           else if(greed[pointer1]>size[pointer2]){
               pointer2++;
           }


       }

       return ans;
    }

}

sc-O(1) , tc- O(n log n)