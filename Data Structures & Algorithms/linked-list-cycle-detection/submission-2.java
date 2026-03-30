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
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode h1=head,h2=head;
        do{
            h1=h1.next;
            h2=h2.next.next;
        }
        while(h2!=null && h2.next!=null && h1!=h2);
        return h1==h2;
    }
}
