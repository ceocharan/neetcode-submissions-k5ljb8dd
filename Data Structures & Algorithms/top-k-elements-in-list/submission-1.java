class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums)
            m.put(i,m.getOrDefault(i,0)+1);
        return m.entrySet().stream().sorted((a,b)->b.getValue()-a.getValue()).limit(k).mapToInt(i->i.getKey()).toArray();
    }
}
