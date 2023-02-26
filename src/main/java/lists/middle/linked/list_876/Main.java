package lists.middle.linked.list_876;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(6);
        ListNode n5 = new ListNode(8);
        ListNode n6 = new ListNode(10);
        ListNode n7 = new ListNode(12);
        ListNode n8 = new ListNode(14);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        System.out.println(sol.middleNode(head));
    }
}
