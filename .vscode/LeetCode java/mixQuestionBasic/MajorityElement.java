//find the numbers in an array that exist in the array more than lengthofArray/3 times
//tc - O(n) sc - O(n)
import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>(); 
        for(int i=0;i<arr.size();i++){
            if(!map1.containsKey(arr.get(i))){
                map1.put(arr.get(i),1);
            }
            else{
                map1.put(arr.get(i),map1.get(arr.get(i))+1);
            }
        }
        for(Integer key: map1.keySet()){
            if(map1.get(key)>arr.size()/3){
                ans.add(key);
            }


        }
        return ans;
    }
}

