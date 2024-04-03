// recursive approach


import java.util.*;

// class BinaryTreeNode {
//     int data;
//     BinaryTreeNode left;
//     BinaryTreeNode right;

//     BinaryTreeNode(int data) {
//         this.data = data;
//         left = null;
//         right = null;
//     }
// }

// space complexity = O(n1 + n2) = time complexity

public class Solution {
    public static BinaryTreeNode mergeTrees(BinaryTreeNode root1, BinaryTreeNode root2) {
      if(root1 == null)return root2;
	  if(root2 == null)return root1;

	  BinaryTreeNode finalAns = new BinaryTreeNode(root1.data + root2.data);
	  finalAns.left = mergeTrees(root1.left, root2.left);
	  finalAns.right = mergeTrees(root1.right, root2.right);

	  return finalAns;

    }
}
