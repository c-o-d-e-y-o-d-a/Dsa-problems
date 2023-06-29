class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
            }
            else{
                num=num-1;
            }
            count++;
        }
        return count;
    }
}

//jab tak no 0 ni hojata tab tak steps ko repeat karte jao condition check karke aur count jo ki 
// steps ka count deta uski value ko increment karte jao by one