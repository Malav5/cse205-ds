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