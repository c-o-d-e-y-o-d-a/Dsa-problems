// here's the brute force solution -beats 100% on runtime on leetcode
//you basically get the no of each int in array and add that no of integers in the array at the required index , this takes 
//2 for loops but we need to optimise the solution to solve the problem in a single for loop
class Solution {
    public void sortColors(int[] arr) {
        int noOf0s = 0;
        int noOf1s = 0;
        int noOf2s = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)noOf0s++;
            if(arr[i]==1)noOf1s++;
            if(arr[i]==2)noOf2s++;
        }
        for(int i=0;i<arr.length;i++){
            if(i<noOf0s){
                arr[i]=0;
            }
            else if(i>=noOf0s&&i<noOf0s+noOf1s){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }
    }
}