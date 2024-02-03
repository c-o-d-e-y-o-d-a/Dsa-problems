class Solution {
    public int search(int[] nums, int target) {
        
        

        int low = 0;
        int high = nums.length-1;
        
        while(low<=high){//always remember to also check if they are equal otherwise the algo won't workf or smaller arrays
            int mid = ((high-low)/2) + low;//remember this simple formulae
            if(nums[mid]==target)return mid;
            else if(nums[mid]>target){
                high = mid - 1;
            }
            else{low = mid+1;}

        }
        return -1;
        
    }
}

//very basic implementation of binary search