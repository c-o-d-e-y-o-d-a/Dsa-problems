//solution i wrote that solves 76/80 test cases
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        boolean finalAns = true;
        double ans1;
        try{
             ans1 = ((double)coordinates[1][1]-(double)coordinates[0][1])/(double)(coordinates[1][0]-(double)coordinates[0][0]);

        }
        catch(Exception e){
            
            ans1=0.0;
           
            
            
            
        }
        

        for(int i=1;i<(coordinates.length-1);i++){
            int[] a = coordinates[i];
            int[] b = coordinates[i+1];
            double x1 = a[0];
            double y1 = a[1];
            double x2 = b[0];
            double y2 = b[1];
            double sloap = (y2-y1)/(double)(x2-x1);
            if(sloap!=ans1){
                finalAns = false;
            }



        }
         boolean XisSame=false ;
        int val = coordinates[0][0];
        for(int i=1;i<coordinates.length;i++){
            if(coordinates[i][0]!=val){
                XisSame=false;
            }
            else{
                XisSame=true;
            }
        }
        if(XisSame==true){
            finalAns=true;
        }
        
        
        return finalAns;
    }
}

//better solution from leetcode that uses the same slope formulae
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            if ((x - x0) * (y1 - y0) != (y - y0) * (x1 - x0)) {
                return false;
            }
        }
        
        return true;
    }
}
