/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode curr = result;
        while(l1!=null || l2!=null)
        {
            int value = carry;
            if(l1!=null)
                value+=l1.val;
            if(l2!=null)
                value+=l2.val;
            carry = value/10;
            curr.next = new ListNode(value % 10);
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
            curr = curr.next;
        }
        if(carry>0)
        {
            curr.next = new ListNode(carry);
        }
        return result.next;
    }
}