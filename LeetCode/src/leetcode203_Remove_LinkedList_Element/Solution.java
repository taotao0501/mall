package leetcode203_Remove_LinkedList_Element;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            //ListNode delNode = head;
            head = head.next;
            //delNode.next = null;
        }

        if(head == null)
            return null;

        ListNode prev = head;
        while(prev.next != null){
            if(prev.next.val == val){
//                ListNode delNode = prev.next;
//                prev.next = delNode.next;
//                delNode.next = null;

                prev.next = prev.next.next;
            }
            else
                prev = prev.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,6,3,4,5,6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution()).removeElements(head,6);
        System.out.println(res);
    }
}
