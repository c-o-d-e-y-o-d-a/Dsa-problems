class Solution {
    public static int fibbo(int n){
        if(n<1)return 0;
        if(n==1)return 1;

        else{
            return fibbo(n-1) + fibbo(n-2);
        }
    }
    public int fib(int n) {
        int ans = fibbo(n);
        return ans;

        
    }
}