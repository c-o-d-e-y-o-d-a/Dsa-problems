class Solution {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)return null;
        if(root.equals(p) || root.equals(q)){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        
        if(left == null)return right;
        if(right == null)return left;

        return root;


        
        
        
    }
}

//logic - two nulls go up if desired elements are not found in the subtree, if null from one side and element from one side goes up that means element exists on the element side
//if element not found send up null , else send up the element, if elements are returned on both left and right of a node after recursion , return the node as it is the lca