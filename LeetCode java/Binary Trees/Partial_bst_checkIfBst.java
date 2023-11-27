// recursion based solution , passes 10/11 test cases

import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;

        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

 *************************************************************/

public class Solution {
    public static boolean helper(BinaryTreeNode<Integer> root){
        if(root == null)return true;
        boolean right = helper(root.left);
        boolean left = helper(root.right);
        boolean curr = true;
        if(root.left != null && root.left.data > root.data){
            curr = false;
        }
        if(root.right != null && root.right.data < root.data){
            curr = false;
        }
        return (right && left && curr);
    }
    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        
        boolean ans = helper(root);
        return ans;
    }
}
