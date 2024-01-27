// easiest approach , use normal level order traversal to get list with lists inside and reverse elements inside all the lists at odd positions

// a bit more complex approach would be to use stacks and queues alternatively or change the order in which one pushes elements insdie them during level order traversal
// here's the code for the first approach 
 import java.util.*;
class Solution {
    public List<List<Integer>> levelorder(TreeNode root,List<List<Integer>> ans,int level){
           if(root == null)
            return ans;
        
        if(ans.size() == level)
            ans.add(new ArrayList<>());
        
        ans.get(level).add(root.val);
        levelorder(root.left, ans,level+1);
        levelorder(root.right, ans,level+1);

        return ans;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelorder(root,ans,0);
        for(int i =0;i<ans.size();i++){
            if(!(i%2 == 0)){
              Collections.reverse(ans.get(i));
            }
        }
        return ans;
    }
}