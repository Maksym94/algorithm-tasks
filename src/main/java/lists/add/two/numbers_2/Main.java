package lists.add.two.numbers_2;

import static lists.add.two.numbers_2.ListNodeCreator.createNodes;

public class Main {

    public static void main(String[] args) {
        ListNode l1 = createNodes(9, 9, 9, 9, 9, 9, 9);
        ListNode l2 = createNodes(9, 9, 9, 9);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println(result);
    }
}
