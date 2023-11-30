import java.util.*;
public class Solution {
    public static void inOrder(TreeNode root, ArrayList<Integer> arr){
        if(root == null ) return;
        inOrder(root.left,arr);
        arr.add(root.data);
        inOrder(root.right,arr);

    }
    
    public static boolean pairSumBst(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        inOrder(root,arr);
        int pointer1 = 0;
        int pointer2 = arr.size()-1;
        while(pointer1 < pointer2){
            if((arr.get(pointer1) + arr.get(pointer2)) == k){
                return true;
            }
            else if((arr.get(pointer1) + arr.get(pointer2)) > k){
                pointer2--;

            }
            if((arr.get(pointer1) + arr.get(pointer2)) < k){
                pointer1++;

                
            }
        }
        return false;

        


        
        
    }
}

// other approaches - for each node's value check if target - nodevalue exits in the tree or not, that can be done by either searching that val in the bst or using a hashnmap
// another approach with tc - O(N) and sc - O(N) , - use two stacks to store the value when the you traverse the bst in borth inorder and reverse inorder