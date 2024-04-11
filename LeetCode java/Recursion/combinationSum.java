// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
// frequency
//  of at least one of the chosen numbers is different.

// The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class Solution {
    public static List< List < Integer > > combSum(int []ARR, int B) {
        // Write your code here.
        Arrays.sort(ARR);
        List<List<Integer>> ans = new ArrayList<>();
   List<Integer> ds = new ArrayList<>();

        combination(0,ans,ARR,B,ds);
        return ans;
    }
// [[2,2,3][7]]

    public static void combination(int ind, List<List<Integer>>ans,int[]arr,int tar,List<Integer>ds)
    {
        if(ind ==arr.length)
        {
            if(tar ==0)
            {
                ans.add(new ArrayList(ds));
            }
            return;
        }

        if(arr[ind]<=tar)
        {
            ds.add(arr[ind]);
            combination(ind,ans,arr,tar-arr[ind],ds);
            ds.remove(ds.size()-1);
        }
        combination(ind+1,ans,arr,tar,ds);


    }
}