package lists.add.two.numbers_2;

class ListNodeCreator {

    private ListNodeCreator() {
    }

    static ListNode createNodes(int... numbers) {
        ListNode result = new ListNode();
        ListNode current = result;
        for (int i = 0; i < numbers.length; i++) {
            int val = numbers[i];
            if (i == 0) {
                current.val = val;
            } else {
                ListNode node = new ListNode(val);
                current.next = node;
                current = node;
            }
        }
        return result;
    }

}
