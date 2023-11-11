public class Solution {
    static class Stack {
        int size = 0;
        
        Node top = null;
        

        Stack()
        {
            
            
        }

        int getSize()
        {
            return size;
        }

        boolean isEmpty()
        {
            if(size < 1)return true;
            return false;
        }

        void push(int data)
        {
            if(size==0){
                Node head = new Node(data);
                top = head;
            }
            else{
                Node newNode = new Node(data);
                newNode.next = top;
                top = newNode;
            }
            size++;
        }

        void pop()
        {
            
            if(size>0){
                top = top.next;
                size--;
            }
            //only decrease size if the array is not empty , otherwise the size decreases everytime even if the function is called on an empty array
        }

        int getTop()
        {
            if(isEmpty()){
                return -1;
            }
            else{return top.data;}
            
        }
    }
}
