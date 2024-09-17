class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];  // Initialize the visited array
        int finalAns = 0;

        Queue<RottenDetails> q = new LinkedList<>();

        // Initialize the queue with all rotten oranges and mark them as visited
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 2) {
                    RottenDetails temp = new RottenDetails(i, j, 0);
                    q.add(temp);
                    visited[i][j] = 1;  // Mark the rotten orange as visited
                }
            }
        }

        while(!q.isEmpty()) {
            RottenDetails curr = q.poll();
            int col = curr.col;
            int row = curr.row;
            int time = curr.time;
            finalAns = Math.max(time, finalAns);
            int[] colVals = {1, -1, 0, 0};
            int[] rowVals = {0, 0, 1, -1};
            for(int i = 0; i < 4; i++) {
                int rowInd = row + rowVals[i];
                int colInd = col + colVals[i];
                // Check if the new position is valid and unvisited
                if(rowInd < m && rowInd >= 0 && colInd < n && colInd >= 0) {
                    if(grid[rowInd][colInd] == 1 && visited[rowInd][colInd] == 0) {
                        visited[rowInd][colInd] = 1;  // Mark it as visited
                        RottenDetails temp = new RottenDetails(rowInd, colInd, time + 1);
                        q.add(temp);
                    }
                }
            }
        }

        // Check if any fresh oranges were not reached
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1 && visited[i][j] == 0) {
                    return -1;  // If a fresh orange is left unvisited, return -1
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
