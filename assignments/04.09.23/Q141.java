/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Q141 {
    public boolean hasCycle(ListNode head) {
        ListNode t1=head;
        ListNode t2=head;

        while(t1!=null &&t1.next!=null){
            t1=t1.next.next;
            t2=t2.next;

            if(t1==t2){
                return true;
            }
        }
        return false;
    }
}
