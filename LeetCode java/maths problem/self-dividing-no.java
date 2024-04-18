import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static boolean helper(int num){
        int num2 = num;
        while(num2 > 0){
            int n = num2 % 10;
            if(n==0)return false;
            if(num % n != 0){return false;}
            num2 = num2 / 10;

        }
        return true;
    }
    public static ArrayList<Integer> findAllSelfDividingNumbers(int lower, int upper) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=lower;i<=upper;i++){
            if(helper(i)){
                ans.add(i);
            }
        }
        return ans;
        
    }
}