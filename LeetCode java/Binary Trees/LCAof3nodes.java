/**********************************************************
	Following is the Binary Tree Node class.

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
		this.data = data;
	    }
	}
	
***********************************************************/
//recursive solution
public class Solution {
	public static BinaryTreeNode<Integer> helper(BinaryTreeNode<Integer> curr,int a ,int b,int c){
		if(curr == null)return null;
		if(curr.data == a || curr.data == b || curr.data == c){
			return curr;
		}
		BinaryTreeNode<Integer> a1 = null;
		BinaryTreeNode<Integer> b1 = null;

		
			a1 = helper(curr.left,a,b,c);

		
		
			b1 = helper(curr.right,a,b,c);
			
			if(a1 == null && b1 == null)return null;
			if(a1 == null && b1 != null)return b1;
			if(a1 != null && b1 == null)return a1;
			return curr;
		


	}
    public static BinaryTreeNode<Integer> lcaOfThreeNodes(BinaryTreeNode<Integer> root, int node1, int node2,
            int node3) {
				return helper(root,node1,node2,node3);
        
    }
}