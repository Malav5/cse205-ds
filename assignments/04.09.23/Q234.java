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
class Q234 {
    public boolean isPalindrome(ListNode head) {
        
        ListNode tmp=head;
        
        if (head == null || head.next == null) {
            return true;
        }

        ListNode prev = null;
        while (head != null) {
            ListNode newNode = new ListNode(head.val);
            newNode.next = prev;
            prev = newNode;
            head = head.next;
        }

        ListNode reversed = prev; // Create a reversed copy of the original list

        // Compare the original and reversed lists
        while (tmp != null) {
            if (tmp.val != reversed.val) {
                return false;
            }
            tmp = tmp.next;
            reversed = reversed.next;
        }

        return true;
    }

    // private ListNode reverseAndClone(ListNode head) {
    //     ListNode prev = null;
    //     while (head != null) {
    //         ListNode newNode = new ListNode(head.val);
    //         newNode.next = prev;
    //         prev = newNode;
    //         head = head.next;
    //     }
    //     return prev;
    // }
    
}

