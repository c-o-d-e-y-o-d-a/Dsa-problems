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
        