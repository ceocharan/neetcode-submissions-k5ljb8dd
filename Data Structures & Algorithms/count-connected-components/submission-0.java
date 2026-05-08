class Solution {
    public int countComponents(int n, int[][] edges) {
        int vis[] = new int[n];
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for(int edge[] : edges) {
            graph.computeIfAbsent(edge[0],x -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1],x -> new ArrayList<>()).add(edge[0]);
        }
        int res = 0;
        for(int i=0;i<n;i++) {
            if(vis[i] == 0) {
                bfs(i,graph,vis);
                res++;
            }
            System.out.println(Arrays.toString(vis));
        }
        return res;
    }

    void bfs(int i,Map<Integer,List<Integer>> graph,int vis[]){
        Queue<Integer> queue=new LinkedList<>();
        vis[i] = 1;
        queue.add(i);
        while(!queue.isEmpty()) {
            int node = queue.poll();
            for(int ele:graph.getOrDefault(node,new ArrayList<>())) {
                if(vis[ele] == 0){
                    vis[ele] = 1;
                    queue.add(ele);
                }
            }
        }
    }

    
}
