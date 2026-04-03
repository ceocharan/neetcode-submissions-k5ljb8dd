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
    public void reorderList(ListNode head) {
        ListNode p1=head,p2=head;
        while(p2!=null && p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }
        Stack<ListNode> st=new Stack<>();
        while(p1!=null){
            st.push(p1);
            p1=p1.next;
        }
        p1=head;
        int size=st.size();
        while(!st.isEmpty()){
            p2=p1.next;
            p1.next=st.pop();
            p1=p1.next;
            if(size>1){
                p1.next=p2;
                p1=p1.next;
            }
            size--;
        }
        p1.next=null;

    }
}
