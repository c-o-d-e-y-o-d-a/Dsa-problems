//using global variable
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
class Solution {
    public int max = -2;
    
    public int diameterOfBinaryTree2(TreeNode root) {
        if (root == null)return 0;

        int longestLeftTree = diameterOfBinaryTree2(root.left);
        int longestRightTree = diameterOfBinaryTree2(root.right);
        max = Math.max(max,longestLeftTree + longestRightTree );

        if(longestLeftTree > longestRightTree)return longestLeftTree+1;
        else{return longestRightTree+1;} 


    }
    public int diameterOfBinaryTree(TreeNode root) {
       
        

        diameterOfBinaryTree2(root);
        return max;
        
        
        

    }
}

//without using a global variable 
//we use array instead of a varibale int bc arrays are passed by refrence and hence thier value can be changed
class Solution {
   
    
    public int diameterOfBinaryTree2(TreeNode root,int[] max) {
        if (root == null)return 0;
        
        int longestLeftTree = diameterOfBinaryTree2(root.left,max);
        int longestRightTree = diameterOfBinaryTree2(root.right,max);
        max[0] = Math.max(max[0],longestLeftTree + longestRightTree );

        if(longestLeftTree > longestRightTree)return longestLeftTree+1;
        else{return longestRightTree+1;} 


    }
    public int diameterOfBinaryTree(TreeNode root) {
       
        int[] max = new int[1];
        max[0] = -1;

        diameterOfBinaryTree2(root,max);
        return max[0];
        
        
        

    }
}