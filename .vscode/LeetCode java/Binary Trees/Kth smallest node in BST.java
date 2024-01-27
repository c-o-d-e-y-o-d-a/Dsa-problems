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

//same approach (using inorder to find the required element)
//but without using the arraylist to store the order

public class Solution {
    public static void helper(TreeNode root,int[] elementNo,int k,int[] arr){
        if(root  == null )return;
        helper(root.left,elementNo,k,arr);
        elementNo[0]++;
        if(k==elementNo[0]){
            arr[0] = root.data;
            return;
            }

        helper(root.right,elementNo,k,arr);




    }
    public static int kthSmallest(TreeNode root, int k) {
        int[] arr = new int[1];
        int[] el = new int[1];
        arr[0] = 0;
        el[0] = 0;
        helper(root,el,k,arr);
        return arr[0];
        
    }
} 