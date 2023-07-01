class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] finalArray = new int[2*n];
        int f =0;
        for(int i=0;i<finalArray.length-1;i+=2){
            finalArray[i]=nums[f++];
            finalArray[i+1]=nums[n++];
        }
        return finalArray;
    }
}

/* couldn't do the problem on my own propoerly , tried many ways to do stuff
but couldn't reach the proper solution,here's everything i did wrong
try to get the element using the iterative i value from the nums array , this
approach makes much more sense , also didn't know that one can leave indexes in an array 
empty while filling the ones after the empty ones , did think of this approach on my own

 */