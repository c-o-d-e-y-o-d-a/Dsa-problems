class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        
        int[][] visited = new int[m][n];

        int[] posColmns = {1,-1,0,0};
        int[] posRows = {0,0,-1,1};

        Pair initial = new Pair(sr,sc);
        int initialColor = image[sr][sc];

        Queue<Pair> q = new LinkedList<>();
        q.add(initial);
        image[sr][sc] = color;
        while(q.size()!=0){
            Pair curr = q.poll();
            for(int i=0;i<4;i++){
                int colInd = curr.c + posColmns[i];
                int rowInd = curr.r + posRows[i];

                if( 0 <= rowInd && rowInd < m && 0 <= colInd && colInd< n){
                    if(image[rowInd][colInd] == initialColor && visited[rowInd][colInd] != 1){
                        image[rowInd][colInd] = color;
                        visited[rowInd][colInd] = 1;
                        Pair newPair = new Pair(rowInd,colInd);
                        q.add(newPair);
                    }


                }
                
            }

        }
        return image;


        
    }
}

class Pair{
    int r;
    int c;
    Pair(int r, int c){
        this.c = c;
        this.r = r;

    }
}