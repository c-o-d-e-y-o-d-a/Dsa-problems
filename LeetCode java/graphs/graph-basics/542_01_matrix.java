class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] result = new int[m][n];
        
        Queue<Pair> que = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                    que.add(new Pair(i,j));
                    result[i][j] = 0;
                }

                else if(mat[i][j] == 1){
                    result[i][j] = -1;
                }
            }
        }
        int[] cols = {0,0,-1,1};
        int[] rows = {1,-1,0,0};
        while(que.size() != 0){
            Pair curr = que.poll();
            int col = curr.i;
            int row = curr.j;
            for(int i=0;i<4;i++){
                if(cols[i]+col >= 0 && cols[i]+col <n && rows[i] + row >= 0 && rows[i] + row < m && result[rows[i] + row][cols[i]+col] == -1){
                    que.add(new Pair( rows[i] + row, cols[i] + col));
                    result[rows[i] + row] [cols[i] + col] = result[row][col] + 1;





                }
            }


            
        }
        return result;






        
        
    }
}
class Pair{
    int i;
    int j;
    Pair(int i, int j){
        this.i = i;
        this.j = j;
    }
}