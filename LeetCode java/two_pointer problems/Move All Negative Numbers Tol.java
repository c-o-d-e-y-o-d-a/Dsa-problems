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
