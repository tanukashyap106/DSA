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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        while(prev.next!=null && prev.next.next!=null){
            ListNode curr=prev.next;
            ListNode n=curr.next;
            curr.next=n.next;
            n.next=curr;
            prev.next=n;
            prev=curr;
        }
        return dummy.next;
    }
}