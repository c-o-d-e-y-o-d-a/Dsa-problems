/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode finalAns ;
    public void helper(TreeNode original , TreeNode curr, TreeNode target){
       
        if(curr == null)return;
        if(curr.val == target.val)this.finalAns = curr;
        helper(original, curr.left,target);
        
        helper(original,curr.right,target);
        
    }


    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
       
       helper(original, cloned, target);
      return finalAns;
        
        

        
    }
}