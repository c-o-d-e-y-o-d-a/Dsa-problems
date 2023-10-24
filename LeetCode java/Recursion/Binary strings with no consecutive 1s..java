//give all possible binary strings of a certain length with no consecutive 1s . 
import java.util.*;

public class Solution {
    public static void helper(char[] arr,List<String> ans,int currLen,int maxLen){
        if(currLen == maxLen){
            ans.add(new String(arr));
            return;
        }
        if(arr[currLen-1]=='1'){
            arr[currLen] = '0';
            helper(arr,ans,currLen+1,maxLen);
        }
        if(arr[currLen-1] == '0'){
            arr[currLen] = '0';
            helper(arr,ans,currLen+1,maxLen);

            arr[currLen] = '1';
            helper(arr,ans,currLen+1,maxLen);
        }
        
        
        
        
    }
    public static List< String > generateString(int N) {
        List<String> ans = new ArrayList<String>();
        char[] arr = new char[N];
      
        arr[0] = '1';
        helper(arr,ans,1,N);
        arr[0] = '0';
        helper(arr,ans,1,N);

        Collections.sort(ans);
        return ans; 

        

        
    }
}

//mistakes I made:
confusing between data type of string and int while initilaising array, not using collections.sort(was using arrays sort instead)