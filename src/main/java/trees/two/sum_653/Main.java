package trees.two.sum_653;

public class Main {

    public static void main(String[] args) {
        TreeNode rightRight = new TreeNode(8);
        TreeNode rightLeft = new TreeNode(6);
        TreeNode leftRight = new TreeNode(4);
        TreeNode leftLeft = new TreeNode(2);
        TreeNode left = new TreeNode(3, leftLeft, leftRight);
        TreeNode right = new TreeNode(7, rightLeft, rightRight);
        TreeNode root = new TreeNode(5, left, right);

        Solution solution = new Solution();
        boolean foundNumber = solution.inOrder(root, 9);
        System.out.println("Found 9 into tree: " + foundNumber);
        TreePrinter.printTree(root);
    }
}
