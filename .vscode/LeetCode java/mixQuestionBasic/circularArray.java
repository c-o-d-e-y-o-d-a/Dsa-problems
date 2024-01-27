//find the contigous subarray with max sum , the last element is connected to the first element 

//how this approach solves the problem - you first find the max sub array sum using kandan's algo , if it return negative no that means there are only negative nos in the array
//then you find the total sum of the array and convert each neg no into pos and each pos no into neg, ex- [1,2,-1,-5,0,9,-2] becomes [-1,-2,1,5,0,-9,2]
//the trick is that the max sub array is equal to the totsum + the sum of the subarray with min value, we reverse the elements bc kandan's algo
//can only find the max sum of subarray in an array with all positive elements


import java.lang.Math;

public class Solution {

    public static int maxSubarraySum(int[] arr, int n) {
        
        int csum =0;
        int msf = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            csum = arr[i] + Math.max(0,csum);
            msf = Math.max(csum,msf);
        }
        if(msf<0)return msf;
        int totSum =0;
        for(int i=0;i<n;i++){
            totSum+=arr[i];
            arr[i] = -arr[i];
        }


        int csum1 =0;
        int msf1 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            csum1 = arr[i] + Math.max(0,csum1);
            msf1 = Math.max(csum1,msf1);
        }
        int circSum = msf1+totSum;
        



        

        return Math.max(circSum,msf);
        }

}