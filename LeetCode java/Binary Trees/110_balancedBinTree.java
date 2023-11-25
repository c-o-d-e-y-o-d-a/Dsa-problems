/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//beats 100 % with java
class Solution {
    public int helper(TreeNode root ,boolean[] ifBalanced){
        if(root == null)return 0;
       
        int left = helper(root.left,ifBalanced);
        int right = helper(root.right,ifBalanced);

        if(left - right > 1 || right - left > 1){
            ifBalanced[0] = false;

        }

        if(left > right ) return left+1;
        else{return right+1;}

        
    }
    public boolean isBalanced(TreeNode root) {
        boolean[] a = new boolean[1];
        a[0] = true;
        int temp = helper(root,a);
        return a[0];
        
    }
}