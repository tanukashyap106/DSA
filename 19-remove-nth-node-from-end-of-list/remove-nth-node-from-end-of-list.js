/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    let sentinel=new ListNode();
    sentinel.next=head;
    let f=sentinel;
    for(let i=0;i<n;i++){
        f=f.next;
    }

    let s=sentinel;
    while(f.next){
        s=s.next;
        f=f.next;
    }
    s.next=s.next.next;
    return sentinel.next;

    
};