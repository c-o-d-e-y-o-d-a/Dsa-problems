
//my solution using two stacks

class Solution {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null)return ans;//remember to check this base case
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        
        
        s1.push(root);
        while(!s1.isEmpty()){
            
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            ArrayList<Integer> temp = new ArrayList<Integer>();
            while(!s2.isEmpty()){
                TreeNode A = s2.pop();
                if(A.left != null)s1.push(A.left);
                if(A.right!= null)s1.push(A.right);
                temp.add(A.val);
                
            }
            ans.add(temp);



        }
        return ans;

        
    }
}

//using a single queue  
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
    
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(q.size()>0){
            List<Integer> arr = new ArrayList<>();
            int n = q.size();
            for(int i=0; i<n; i++){
                TreeNode a = q.remove();
                arr.add(a.val);
                if(a.left!=null) q.add(a.left);
                if(a.right!=null) q.add(a.right);
            }
            ans.add(arr);
        }
        return ans;
    }
}