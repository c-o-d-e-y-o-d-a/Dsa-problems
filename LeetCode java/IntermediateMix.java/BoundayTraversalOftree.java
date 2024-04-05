import java.util.*;

public class Solution {
    public static void LeafNode(TreeNode root, ArrayList<Integer> ans) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            ans.add(root.data);
            return;
        }
        LeafNode(root.left, ans);
        LeafNode(root.right, ans);
    }

    public static List<Integer> traverseBoundary(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (root == null) return ans;

        ans.add(root.data);

        TreeNode curr = root.left;
        while (curr != null) {
            if (curr.left != null || curr.right != null)
                ans.add(curr.data);
            if (curr.left != null) 
                curr = curr.left;
            else 
                curr = curr.right;
        }

       
        ArrayList<Integer> leafNodes = new ArrayList<Integer>();
        LeafNode(root, leafNodes);

        
        for (int i = 0; i < leafNodes.size(); i++) {
            ans.add(leafNodes.get(i));
        }

        Stack<Integer> rightBoundary = new Stack<Integer>();
        curr = root.right;
        while (curr != null) {
            if (curr.left != null || curr.right != null)
                rightBoundary.push(curr.data);
            if (curr.right != null)
                curr = curr.right;
            else 
                curr = curr.left;
        }

        while (!rightBoundary.isEmpty()) {
            ans.add(rightBoundary.pop());
        }

        return ans;
    }
}
