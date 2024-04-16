//super easy solution lol tc - O(n) , sc-O(1)
import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
       ArrayList<Integer> newArr = new ArrayList<Integer>();
       int currRightBiggest = Integer.MIN_VALUE;
       for(int i=a.length-1;i>=0;i--){
           if(a[i]>currRightBiggest){
               newArr.add(a[i]);
               currRightBiggest = a[i];
               }

       }
       return newArr;
    }
}