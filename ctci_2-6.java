/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
       ListNode fast = head;
        ListNode slow = head;
       while(fast!=null && fast.next!=null)
       {
           slow = slow.next;
           fast = fast.next.next;
       }
        ListNode comp1 = head;
        ListNode comp2 = rev(slow);
        
        while(comp1!=null&& comp2!=null)
        {
            if(comp1.val!=comp2.val)
                return false;
            comp1 = comp1.next;
            comp2 = comp2.next;                
        }
        return true;
    }
    void printList(ListNode node) { 
        while (node != null) { 
            System.out.print(node.val + " "); 
            node = node.next; 
        } 
    } 
    public ListNode rev(ListNode head)
    {
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        head = prev;
        printList(head);
        return head;
    }
    
}