class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> ans1 = new ArrayList<>();
        for(int i=0;i<V;i++){
            ans1.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<edges.length;i++){
            int[] a = edges[i];
            ans1.get(a[0]).add(a[1]);
            ans1.get(a[1]).add(a[0]);
            
            
            
        }
        
        return ans1;
        
        
        
        
    }
}