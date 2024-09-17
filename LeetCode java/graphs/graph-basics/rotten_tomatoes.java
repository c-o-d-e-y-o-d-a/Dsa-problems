class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        int finalAns = 0;

        Queue<RottenDetails> q = new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    RottenDetails temp = new RottenDetails(i,j,0);
                    q.add(temp);
                }
            }
        }

        while(q.size()!=0){
            RottenDetails curr = q.poll();
            int col = curr.col;
            int row = curr.row;
            int time = curr.time;
            finalAns = Math.max(time,finalAns);
            int[] colVals = {1, -1, 0, 0};
            int[] rowVals = {0, 0, 1, -1};
            for(int i=0;i<4;i++){
                int rowInd = row + rowVals[i];
                int colInd = col + colVals[i];
                if( rowInd < m && rowInd >= 0){
                    if( colInd < n && colInd >=0 ){
                        if(grid[rowInd][colInd] == 1 && visited[rowInd][colInd] != 2){
                            visited[rowInd][colInd] = 2;
                            RottenDetails temp = new RottenDetails(rowInd, colInd, time+1);
                            q.add(temp);


                        }

                    }
                }
            }




        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j] == 0 && (grid[i][j] == 1 )){
                    return -1;
                }
            }
        }
        return finalAns;



        


        
        
    }
}

class RottenDetails {
    int col;
    int row;
    int time;

    RottenDetails(int a, int b, int c) {
        this.col = a;
        this.row = b;
        this.time = c;

    }
}