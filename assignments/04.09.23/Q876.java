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
class Q876 {
    public ListNode middleNode(ListNode head) {
        int len =0;
        ListNode tmp=head;
        if(head==null){
            return null;
        }

        while(tmp!=null){
            len++;
            tmp=tmp.next;
        }
        int middle =len/2;
        tmp=head;

        for(int i=0;i<middle;i++){
            tmp=tmp.next;
        }
        return tmp;
    }
}