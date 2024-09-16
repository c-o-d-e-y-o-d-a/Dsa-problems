class Solution {
    public int findCircleNum(int[][] isConnected) {
        int[] visited = new int[isConnected.length];
        int ans = 0;
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]!=1){
                ans++;
                getBFS(isConnected, i, visited);



            }
        }
        return ans;



       


        
        
        
    }
    void getBFS(int[][] mat, int index, int[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(index);
        visited[index] = 1;
        while(q.size()!=0){
            int ind = q.poll();
            for(int i=0;i<mat[ind].length;i++){
                if(mat[ind][i]==1  && visited[i] == 0){
                    q.add(i);
                    visited[i] = 1;

                }
                
            }

        }




    }

}