//you need to move all negative integers before all posiitve integers in an array

//here's the brute force approah with tc-O(n) and sc-O(n)
/*

mem0ry You performed better than
94.74%

time    65.47%



 */

public class Solution {
    public static int[] separateNegativeAndPositive(int a[]) {
        int[] ansArr = new int[a.length];
        int i2 =0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                ansArr[i2]=a[i];
                i2++;
            }

        }

        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                ansArr[i2]=a[i];
                i2++;
            }
        }
        return ansArr;
    }
}
  




import java.util.Arrays;

public class Solution {
    public static int[] separateNegativeAndPositive(int a[]) {
        Arrays.sort(a);
        return a;
            
    }
    
} //another solution


// code with right approach but exceeds time limit 
import java.util.Arrays;

public class Solution {
    public static int[] separateNegativeAndPositive(int a[]) {
        int left = 0;
        int right = a.length-1;
        while(right>left){
            if(a[left]<0 && a[right]>0){
                left++;
                

            }
            else if(a[left]>0 && a[right]>0){
                right--;
            }
            else if(a[left]>0 && a[right]<0){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
            else if(a[left]<0 && a[right]<0){
                left++;

            }
        }
        return a;
    }
    
}


//most optimised approach

/*

you basically have two pointers , one which starts from the beginning and goes over each element to check if they are negative 
and anothert to swap the elements in the beginning , swapping is done only when a negative no is found by the pointer going over each element , even 
if it finds a neg element and we are on a neg no it still swaps them
 */

import java.util.Arrays;

public class Solution {
    public static int[] separateNegativeAndPositive(int nums[]) {
        int j=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]<0){
                if(i != j){ 
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                ++j;
            }
        }
        return nums;
    }
    
}
