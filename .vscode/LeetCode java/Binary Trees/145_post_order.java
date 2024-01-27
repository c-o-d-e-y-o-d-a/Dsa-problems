*/
class Solution {
    public void helper(TreeNode root,ArrayList<Integer>arr){
        if(root == null)return ;
        helper(root.left,arr);
        helper(root.right,arr);
        arr.add(root.val);

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        helper(root,arr);
        return arr;

        
    }
}