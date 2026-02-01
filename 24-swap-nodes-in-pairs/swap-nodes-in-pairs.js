/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var swapPairs = function(head) {
    if(!head || !head.next) return head;
    let dummy=new ListNode();
    dummy.next=head;
    let prev = dummy;
    let curr=head;
    let nextNode= head.next;
    while(curr && nextNode){
        prev.next=nextNode;
        curr.next=nextNode.next;
        nextNode.next=curr;
        prev=curr;
        curr=prev.next;
        nextNode=curr && curr.next;
    }
    return dummy.next;
    
};