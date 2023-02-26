package lists.middle.linked.list_876;

import java.util.StringJoiner;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        ListNode curr = this;
        while (curr != null) {
            joiner.add("" + curr.val);
            curr = curr.next;
        }
        return joiner.toString();
    }
}
