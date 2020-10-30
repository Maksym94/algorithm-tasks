package lists.add.two.numbers_2;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = null;
        int prev = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + prev;
            prev = sum / 10;
            if (current == null) {
                current = result;
                current.val = sum % 10;
            } else {
                ListNode next = new ListNode();
                next.val = sum % 10;
                current.next = next;
                current = next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode tail = null;
        if (l1 != null) {
            tail = l1;
        } else if (l2 != null) {
            tail = l2;
        }
        while (tail != null) {
            ListNode next = new ListNode();
            int sum = tail.val + prev;
            prev = sum / 10;
            if (current == null) {
                current = result;
                current.val = sum % 10;
            } else {
                next.val = sum % 10;
                current.next = next;
                current = next;
            }
            tail = tail.next;
        }
        if (prev > 0) {
            current.next = new ListNode(prev);
        }
        return result;
    }

    public ListNode addTwoNumbersFromAlgorithm(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = result;
        int carry = 0;
        ListNode p = l1;
        ListNode q = l2;
        while (p != null || q != null) {
            int x = p == null ? 0 : p.val;
            int y = q == null ? 0 : q.val;
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry == 1) {
            current.next = new ListNode(carry);
        }
        return result.next;
    }

}
