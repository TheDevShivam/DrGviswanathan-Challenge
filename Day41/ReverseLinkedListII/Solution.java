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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == 1 && right == 1){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next;       

        for(int i=1; i<left; i++){
            prev = curr;
            curr = curr.next;
        }

        ListNode ptr1 = prev;
        ListNode ptr2 = curr;

        for(int i=1; i<=right-left+1; i++){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        

        if (ptr1 != null) {
            ptr1.next = prev;
        } else {
            head = prev;
        }

       ptr2.next = curr;

        return head;
    }
}