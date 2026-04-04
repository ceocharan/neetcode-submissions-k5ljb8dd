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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1=head,p2=head,p3=null;
        while(n-->0 && p1!=null){
            p1=p1.next;
        }
        while(p1!=null){
            if(p3==null){
                p3=p2;
            }
            else{
                p3=p3.next;
            }
            p2=p2.next;
            p1=p1.next;
        }
        while(p2.next!=null && p3!=null){
            p3=p3.next;

            p2.val=p2.next.val;
            p2=p2.next;
        }
        if(p3!=null){
            p3.next=null;
            return head;
        }
        if(head.next!=null){
            return head.next;
        }
        return null;
        

    }
}
