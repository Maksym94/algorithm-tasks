package lists.middle.linked.list_876;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr);
            curr = curr.next;
        }
        int middleIdx = list.size() / 2;
        return list.get(middleIdx);
    }
}
