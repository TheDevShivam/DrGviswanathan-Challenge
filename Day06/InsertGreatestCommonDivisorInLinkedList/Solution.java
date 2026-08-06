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
public class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode original = head;

        ListNode ptr1 = head;
        ListNode ptr2 = head.next;

        //gcd logic
        while(ptr2 != null){
            int val1 = ptr1.val;
            int val2 = ptr2.val;

            while(val2 != 0){
                int temp = val2;
                val2 = val1 % val2;
                val1 = temp;
            }

            ListNode newNode = new ListNode(val1);

            newNode.next = ptr1.next;
            ptr1.next = newNode;

            ptr1 = ptr1.next.next;
            ptr2 = ptr2.next;
        }

        return original;
    }
}