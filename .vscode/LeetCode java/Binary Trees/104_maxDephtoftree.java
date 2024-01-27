class Solution {
    public int helper(TreeNode root){
        if(root == null)return 0;
        
        int leftLen = helper(root.left);
        int rightLen = helper(root.right);

        if(leftLen > rightLen)return leftLen+1;
        else{return rightLen+1;}



    }
    public int maxDepth(TreeNode root) {
        if(root == null){return 0;}
        
        int ans = helper(root);
        return ans;
        
    }
}

//beats 100 % with java, tc - O(N)