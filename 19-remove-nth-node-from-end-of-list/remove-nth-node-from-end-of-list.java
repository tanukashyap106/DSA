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
        ListNode sentinel=new ListNode(0);
        sentinel.next=head;
        ListNode curr=head;
        int length=0;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        ListNode prev=sentinel;
        for(int i=0;i<length-n;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return sentinel.next;

    }
}