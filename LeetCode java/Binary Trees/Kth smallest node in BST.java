//brute force approach

import java.util.*;
public class Solution {
    public static void helper(TreeNode root,ArrayList<Integer> arr){
        if(root == null)return;
        helper(root.left,arr);
        arr.add(root.data);
        helper(root.right,arr);

    }
    public static int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        helper(root,ans);
        return ans.get(k-1);
    }
}