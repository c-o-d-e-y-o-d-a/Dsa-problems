class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode endNode = head;
        ListNode middleNode = head;
        while(endNode!=null && endNode.next!=null){
            endNode=endNode.next.next;
            middleNode = middleNode.next;
        }
        return middleNode;

        
    }
}

//how code works
//u start with a single node and then keep the no of nodes by one to find a patter
//and voila u find the patter which is that whatever iterations it takes to reach the last nodes or the node right before it
//it takes half of those to reach the middle node which means that the middle node pointer moves forward by one step when the last node pointer moves forward by 2