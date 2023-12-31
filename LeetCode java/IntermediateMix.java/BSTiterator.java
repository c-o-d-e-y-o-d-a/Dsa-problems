// not optimised for space solution

public class Solution {

    static class BSTIterator {

        ArrayList<Integer> inorder;
        int iterator;

        public void inorderFunc(TreeNode<Integer> root) {
            if (root == null) return;
            inorderFunc(root.left);
            inorder.add(root.data);
            inorderFunc(root.right);
        }

        BSTIterator(TreeNode<Integer> root) {
            inorder = new ArrayList<>();
            iterator = -1;
            inorderFunc(root);
        }

        int next() {
            iterator++;
            return inorder.get(iterator);
        }

        boolean hasNext() {
            return iterator < inorder.size() - 1;
        }
    }
}
/*
    Your BSTIterator object will be instantiated and called as such:
    BSTIterator iterator = new BSTIterator(root);
    while(iterator.hasNext())
    {
       print(iterator.next()+" ");
    }
*/
