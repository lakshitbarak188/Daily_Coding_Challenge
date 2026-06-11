package Day_11;

public class Problem_24 {
    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        ListNode prev = new ListNode();
        while(curr!=null && curr.next!=null){
            if(curr==head){
                head=curr.next;
            }
            ListNode temp = curr.next;
            curr.next=curr.next.next;
            temp.next=curr;
            prev.next = temp;
            prev=curr;
            curr=curr.next;

        }
        return head;
    }
}
