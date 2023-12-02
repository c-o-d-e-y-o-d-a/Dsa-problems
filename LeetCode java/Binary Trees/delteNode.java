public class Solution {
    public static BinaryTreeNode<Integer> inord(BinaryTreeNode<Integer> curr){
        BinaryTreeNode<Integer> temp = curr;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }

    public static BinaryTreeNode<Integer> bstDelete(BinaryTreeNode<Integer> root, int key) {
        if (root == null) {
            return root;
        } else if (root.data > key) {
            root.left = bstDelete(root.left, key);
        } else if (root.data < key) {
            root.right = bstDelete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                BinaryTreeNode<Integer> temp = inord(root.right);
                root.data = temp.data;
                root.right = bstDelete(root.right, temp.data);
            }
        }
        return root;
    }
}
