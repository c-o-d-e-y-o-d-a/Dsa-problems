
//time compl- O(n) , sc-O(1)
public class Solution {
    public static int[] findMissingRepeatingNumbers(int []arr) {
      int[] ans = new int[2];

      for(int i=0;i<arr.length;i++){
          int num = Math.abs(arr[i]);
          if(arr[num-1]>0){
              arr[num-1] = -(arr[num-1]);
          }
          else{
              ans[0] = num;
          }
          
      }
      for(int i=0;i<arr.length;i++){
          if(arr[i]>0){ans[1]=(i+1);}
      }

      return ans;
    }
}