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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }
        ListNode nh=null,tem=null;
        while(list1!=null && list2!=null){
            
                if(list1.val<list2.val){
                    if(nh==null){
                    nh=list1;
                    list1=list1.next;
                    tem=nh;

                    }
                    else{
                        tem.next=list1;
                        list1=list1.next;
                        tem=tem.next;

                    }
                   
                }
                else{
                    if(nh==null){

                        nh=list2;
                        list2=list2.next;
                        tem=nh;

                    }
                    else{
                        tem.next=list2;
                        list2=list2.next;
                        tem=tem.next;
                    }
                }
            
            
                
                
        }
        if(list1!=null){
            tem.next=list1;
        }
        if(list2!=null){
            tem.next=list2;
        }
        return nh;
    }
}
