/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var rotateRight = function(head, k) {
    if(!head || !head.next) return head;
    let length=0;
    let curr=head;
    while(curr){
        curr=curr.next;
        length++;
    }
    let second=head;
    let first=head;

    for(let i=0; i<(k%length);i++){
        first=first.next;
    }
    while(first.next){
        second=second.next;
        first=first.next;
    }
        first.next=head;
        let newHead=second.next;
        second.next=null;

    return newHead;
    
};