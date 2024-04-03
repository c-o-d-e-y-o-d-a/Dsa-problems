//brute force approach , tc - O(N) sc - O(N)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] ans = new int[2];
        int[] storage = new int[arr.size()];
        for(int i=0;i<storage.length;i++){
            storage[i]=0;
        }
        for(int i=0;i<arr.size();i++){
            int num = arr.get(i);
            storage[num-1] += 1;

        }
        for(int i=0;i<storage.length;i++){
            if(storage[i]==0){
                ans[0]=i+1;
            }
        }
        for(int i=0;i<storage.length;i++){
            if(storage[i]>1){
                ans[1] = i+1;
            }
        }
        return ans;
    }
}

// solution with time compl - O(N) and space compl - O(1)

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] ans = new int[2];
        int missingNum = 0;
        for(int i=0;i<arr.size();i++){
            int a = Math.abs(arr.get(i));
            if(arr.get(a-1)>0){
                arr.set(a-1,- arr.get(a-1));
            }
            else{
                missingNum = +a;
            }

        }
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                ans[0]=i+1;
                break;
            }
        }
        ans[1] = missingNum;

        return ans;
    }
}