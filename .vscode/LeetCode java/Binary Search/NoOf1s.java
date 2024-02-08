brute force - tc - O(n*m) , semi optimised using binary search - O(nlogm) most optimised - O(n+m)

import java.util.ArrayList;
public class Solution
{
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        int ans = -1;
        int curr1Count = 0;
        int indcurr = m - 1;
       
            for(int i=0;i<n;i++){
                while(indcurr >= 0 && matrix.get(i).get(indcurr)==1)indcurr--;
                int noOf1s = m - indcurr;
                if(noOf1s > curr1Count){
                    curr1Count = noOf1s;
                    ans = i;
                }
            }

            return ans;
        

       
    }
}