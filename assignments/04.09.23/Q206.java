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
class Q206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode tmp=head;
        ListNode next=null;
        while(tmp!=null){
            next=tmp.next;
            tmp.next=prev;
            prev=tmp;
            tmp=next;
        }
        return prev;
    }
}