class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> m=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<numbers.length;i++){
            if(m.containsKey(numbers[i])){
                return new int[]{m.get(numbers[i]),i+1};
            }
            m.put(target-numbers[i],i+1);
        }
        return new int[]{-2,-2};   
    }
}
