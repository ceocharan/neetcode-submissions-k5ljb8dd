class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int count[]=new int[numCourses];
        Map<Integer,List<Integer>> m=new HashMap<>();
        for(int i[]:prerequisites){
            m.computeIfAbsent(i[1],x->new ArrayList<>()).add(i[0]);
            count[i[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<count.length;i++){
            if(count[i]==0){
                q.add(i);
            }
        }
        int node,nodes=numCourses;
        while(!q.isEmpty()){
            node=q.poll();
            nodes--;
            for(int i:m.getOrDefault(node,new ArrayList<>())){
                count[i]--;
                if(count[i]==0){
                    q.add(i);
                }
            }
        }
        System.out.println(nodes);
        return nodes==0;
    }
}
