class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();
        String sb;
        for(String st:strs){
            char c[]=st.toCharArray();
            Arrays.sort(c);
            sb=st;
            st=String.valueOf(c);
            
            List<String> l=m.getOrDefault(st,new ArrayList<>());
            l.add(sb);
            m.put(st,l);
        }
        System.out.println(m);
        return m.values().stream().toList();
    }
}