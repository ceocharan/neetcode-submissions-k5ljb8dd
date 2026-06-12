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
    public ListNode removeElements(ListNode head, int val) {
        ListNode t=new ListNode();
        t.next=head;
        ListNode p=t;
        while(p!=null){
            while(p.next!=null && p.next.val==val){
                p.next=p.next.next;
            }
            p=p.next;
        }
        return t.next;
        
    }
}