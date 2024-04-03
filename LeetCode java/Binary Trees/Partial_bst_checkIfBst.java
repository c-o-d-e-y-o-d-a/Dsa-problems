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
//other approach - use an arraylist to store all the node values in Inorder format, if an BST is traversed in Inorder way then the final is always in ascending order
public class Solution {
    public static void helper(BinaryTreeNode<Integer> root,ArrayList<Integer> arr){
        if(root == null)return;
        helper(root.left,arr);
        arr.add(root.data);
        helper(root.right,arr);
        
    }

    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        helper(root,ans);
        for(int i=1;i<ans.size();i++){
            if(ans.get(i)<ans.get(i-1))return false;
        }
        return true;
    }
}