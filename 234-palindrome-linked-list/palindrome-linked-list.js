/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
    if(!head || !head.next) return true;
    let slow=head;
    let fast=head;
    while(fast && fast.next){
        slow=slow.next;
        fast=fast.next.next;
    }
    let prev=null;
    let curr=slow;
    while(curr){
        let temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
    }
    let first=head;
    let end=prev;
    while(end){
        if(first.val!==end.val){
        return false;
        }

            first=first.next;
            end=end.next;
        
    }
    return true;
    
};