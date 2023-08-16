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

