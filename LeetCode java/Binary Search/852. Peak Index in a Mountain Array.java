// An array arr is a mountain if the following properties hold:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
// Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

// You must solve it in O(log(arr.length)) time complexity.

 

// Example 1:

// Input: arr = [0,1,0]
// Output: 1
// Example 2:

// Input: arr = [0,2,1,0]
// Output: 1
// Example 3:

// Input: arr = [0,10,5,2]
// Output: 1
//beats 100% at rumtime 
//condition to check wether to move left or right - if mid is on the ascending side move right , bc that's where the larger element is
//if mid is on the descending side , move to the left to find the largest element.k

class Solution {

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] >arr[mid-1]){
                start = mid;

            }
            else if(arr[mid] < arr[mid-1]){
                end = mid;
            }
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])return mid;
        }
        return -1;
        
    }
}


///brute force - takes linear time
class Solution {

    public int peakIndexInMountainArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                return i;
            }
        }
        return -1;
        
        
    }
}