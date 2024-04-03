// you are given a sorted array and you need to find the element that appears only once in the array (there's only one such element)

// brute force solution
import java.util.*;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {  
        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer> ();
        for(int i=0;i<arr.size();i++){
            if(map1.containsKey(arr.get(i))){
                map1.put(arr.get(i),map1.get(arr.get(i))+1);
            }
            else{map1.put(arr.get(i),1);}
        }
        for(int key:map1.keySet()){
            if(map1.get(key)==1)return key;
        }
        return -1;
    }
}