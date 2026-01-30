/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
let Node=new Set();
let curr=head;
while(curr!==null){
    if(Node.has(curr)){
        return true;
    }
    Node.add(curr);
    curr=curr.next;
}
return false;
    
};