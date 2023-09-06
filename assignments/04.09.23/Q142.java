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
public class Q142 {
    public ListNode detectCycle(ListNode head) {
        ListNode t1=head;
        ListNode t2=head;
        ListNode t3=head;

        while(t1!=null && t1.next!=null){
            t1=t1.next.next;
            t2=t2.next;

            if(t1==t2){
                while(t2!=t3){
                    t2=t2.next;
                    t3=t3.next;
                }
                return t3;
            }
        }
        return null;
    }
}