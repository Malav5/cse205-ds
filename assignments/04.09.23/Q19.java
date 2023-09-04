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
class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp=head;
        ListNode prev=new ListNode();
        int len=0;
        while(tmp!=null){
            len++;
            tmp=tmp.next;
        }
        tmp=head;
        if(len==n){
            return head=head.next;
        }
        for(int i=0;i<len-n;i++){
            prev=tmp;
            tmp=tmp.next;
        }
        prev.next=tmp.next;
        return head;

    }
}