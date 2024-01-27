/* if there's a 0 in the matrix then you turn the whole column and row of that 0 to 0s

 You performed better than
19.18%

You performed better than
85.58%

approach-
store all the indexes of 0s in the matrix in a set (no duplicate values)
and then run another loop to turn all the elements at those indexes to 0

 */



HashSet<Integer> iVal = new HashSet<Integer>();
        HashSet<Integer> jVal = new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    jVal.add(j);
                    iVal.add(i);

                }
                        }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(iVal.contains(i)|| jVal.contains(j)){

                    matrix[i][j] =0;
                    }
                        }
        }
        



        /* Best approach with constant space compl */
        // you use the first row and first column to store a 0 
        // the 0 represents that there's a 0 somewhere in that column or row
        // you just check if the there's a 0 in 0 index row / columb and make any element in the row / column with same index as 0 too 
        //you convert the first row and first column into zeroes (if needed) at the end , you use two booleans and two forloops to check if tthr 
        //first row / column needs to be convertd into 0

        class Solution {
    public void setZeroes(int[][] matrix) {
       Boolean firstRowCheck = false;
        Boolean firstColCheck = false;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                firstColCheck=true;
                break;
            }
        }

        for(int j=0;j<matrix[0].length;j++){
            if(matrix[0][j]==0){
                firstRowCheck=true;
                break;
        }
            }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;

                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                    
                }
            }
        }
        if(firstColCheck){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
        if(firstRowCheck){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i]=0;
            }
        }
    }
}
        
    