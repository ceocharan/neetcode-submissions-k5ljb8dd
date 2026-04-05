/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode(),z=dummy;
        int n=lists.length;
        while(n>0){
            int m=Integer.MAX_VALUE;
            int j=-1;
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null && lists[i].val<m){
                    m=lists[i].val;
                    j=i;
                }
            }
            if(n==1){
                z.next=lists[j];
                break;
            }
            z.next=lists[j];
            z=z.next;
            lists[j]=lists[j].next;
            if(lists[j]==null){
                n--;
            }
        }
        return dummy.next;
    }
}
