//brute force approach- tc- O(n)

public class Solution {
    public static int team(int []skill, int n){

        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(skill[i] > (2*skill[j])){
                    ans++;
                }
            }
        }
        return ans;
    }
}