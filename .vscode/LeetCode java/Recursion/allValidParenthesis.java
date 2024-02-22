import java.util.* ;
import java.io.*; 
public class Solution {
    static void helper(String str,int open,int close,ArrayList<String> ans,int n){
        if(2*n==str.length()){
            ans.add(str);
        }

        if(open<n){
            helper(str+"(",open+1,close,ans,n);

        }
        if(close<open){
            helper(str+")",open,close+1,ans,n);
        }

    }
    public static ArrayList<String> validParenthesis(int n){
        ArrayList<String> ans = new ArrayList<String>();
        helper("",0,0,ans,n);
        return ans;
        
    } 
}

//notes - always pass count+1 in arguments while making recursive calls 