/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int val) {
         this.data = val;
         this.left = null;
         this.right = null;
     }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.data = val;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

semi optimal approach - passes 39/40 test cases

import java.util.*;
public class Solution {
    public static void sortedTraversal(TreeNode root,ArrayList<Integer> sortedList){
        if(root==null)return;
        TreeNode curr = root;
        sortedTraversal(curr.left,sortedList);
        sortedList.add(curr.data);
        sortedTraversal(curr.right,sortedList);

    }
    public static List<Integer> mergeBST(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ArrayList<Integer> finalAns = new ArrayList<Integer>();
        sortedTraversal(root1,arr1);
        sortedTraversal(root2,arr2);
        int pointer1 = 0;
        int pointer2 = 0;
        while(pointer1<arr1.size() && pointer2<arr2.size()){
            if(arr1.get(pointer1)>=arr2.get(pointer2)){
                finalAns.add(arr2.get(pointer2));
                pointer2++;

            }
            else{
                finalAns.add(arr1.get(pointer1));
                pointer1++;
            }
        }
        while(pointer1<arr1.size() ){
            finalAns.add(arr1.get(pointer1));
            pointer1++;
        }
        while(pointer2<arr2.size() ){
            finalAns.add(arr2.get(pointer2));
            pointer2++;
        }
        return finalAns;
        
    }
}