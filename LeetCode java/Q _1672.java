class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = -1;
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j =0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
                
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
        
    }
}
//you just iterate over each customer's array which is given in an array and add and compare 
//with the current maximum to check if its bigger than that value and if it is than you give the max value to that sum