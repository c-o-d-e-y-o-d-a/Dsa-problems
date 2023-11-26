//my solution , fails when right tree > left tree,paased 605/608 test cases on geeks for geeks
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      Node curr = root;
      ArrayList<Integer> ans = new ArrayList<Integer>();
      if(root == null)return ans;
      ans.add(curr.data);
      while(curr.left != null || curr.right != null){
          if(curr.left != null){
              curr = curr.left;
          }
          else if(curr.right!=null){
              curr = curr.right;
          
      }
      ans.add(curr.data);
      
    }
    return ans;
    }
}

//correct approach - uses recursion , you take an arraylist and write a recursive function and pass it as argument along with a variable to store the current level,
// you add the element in the arraylist if there are less elements than the current level inside it, you then call the function first for the left side and then for the right side 
class Tree
{
    public void helper(Node curr,int level,ArrayList<Integer> arr){
        if(curr == null)return;
        if(arr.size() <= level){
            arr.add(curr.data);
        }
        helper(curr.left,level+1,arr);
        helper(curr.right,level+1,arr);
        }
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> ans = new ArrayList<Integer>();
      if(root == null)return ans;
      helper(root,0,ans);
      return ans;
    }
}