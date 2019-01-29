/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode before_ptr = before;
        ListNode after = new ListNode(0);
        ListNode after_ptr = after;
        
        while(head!=null)
        {
            if(head.val<x)
            {
                before_ptr.next = head;
                before_ptr = before_ptr.next;
            }
            else
            {
                after_ptr.next = head;
                after_ptr = after_ptr.next;
            }
            head = head.next;
        }
        after_ptr.next = null;
        before_ptr.next = after.next;
        return before.next;
    }
}