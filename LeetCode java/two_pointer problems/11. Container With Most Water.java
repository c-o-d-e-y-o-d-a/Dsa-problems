//brute force approach with tc - O(n*n) and sc - O(1)

class Solution {
    public int maxArea(int[] height) {
        int finalAns = 0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i;j<height.length;j++){
                int heit = Math.min(height[i],height[j]);
                int vol = heit * (j-i);
                finalAns = Math.max(vol,finalAns);
            }
        }
        return finalAns;
        
    }
}


//better approach with tc- O(n) and sc - O(1)
/*
Runtime
Details
5ms
Beats 30.14%of users with Java
Memory
Details
55.66mb
Beats 51.82%of users with Java


how it works - you need to find the biggest no smaller than the biggest number you found till now
we always move the pointer at the lower value 

 */
class Solution {
    public int maxArea(int[] height) {
        int finalAns = 0;
        int start = 0;
        int end = height.length-1;
        while(start<end){
            int heit = Math.min(height[start],height[end]);
            int vol = heit * (end - start);
            finalAns = Math.max(finalAns,vol);
            if(height[start]>height[end]){
                end--;
            }
            else if(height[start]<height[end]){
                start++;
            }
            else{end--;//if both are same this happens
            start++;}
        }
          return finalAns;
        
    }
}

