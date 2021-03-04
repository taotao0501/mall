package leetcode203_Remove_LinkedList_Element;

public class Solution2 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode cur = dummyHead;
        while(cur.next != null){
            if(cur.next.val == val)
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }

        return dummyHead.next;
    }
}
