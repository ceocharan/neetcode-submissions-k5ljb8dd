/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals,(a,b)->a.start==b.start ? a.end-b.end : a.start-b.start);
        System.out.println(intervals);
        int res=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->a-b);
        for(Interval i:intervals){
            while(!pq.isEmpty() && pq.peek()<=i.start){
                pq.poll();
            }
            pq.add(i.end);
            res=Math.max(res,pq.size());
        }
        return res;

    }
}
