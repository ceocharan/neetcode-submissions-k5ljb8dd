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
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals,(a,b)-> a.end==b.start ? a.end-b.end : a.end-b.start);
        int p1=0,p2=1;
        while(p2<intervals.size()){
            if(intervals.get(p1).end>intervals.get(p2).start){
                return false;
            }
            p1++;
            p2++;
        }
        System.out.println(intervals);
        return true;
    }
}
