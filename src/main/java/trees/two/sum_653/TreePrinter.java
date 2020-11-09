package trees.two.sum_653;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreePrinter {

    public static void printTree(TreeNode root) {
        int maxLevel = getMaxLevel(root);
        printNode(Collections.singletonList(root), 1, maxLevel);
    }

    private static int getMaxLevel(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getMaxLevel(root.left), getMaxLevel(root.right)) + 1;
    }

    private static void printNode(List<TreeNode> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || isAllElementsNull(nodes)) {
            return;
        }
        int floor = maxLevel - level;
        int edgeLines = (int) Math.pow(2, Math.max(floor - 1, 0));
        int firstSpaces = (int) Math.pow(2, floor) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        printSpaces(firstSpaces);
        List<TreeNode> nextNodes = new ArrayList<>();
        for (TreeNode treeNode : nodes) {
            if (treeNode != null) {
                System.out.print(treeNode.val);
                nextNodes.add(treeNode.left);
                nextNodes.add(treeNode.right);
            } else {
                printSpaces(1);
            }
            printSpaces(betweenSpaces);
        }
        System.out.println();

        printEdges(nodes, edgeLines, firstSpaces);
        printNode(nextNodes, level + 1, maxLevel);
    }

    private static void printEdges(List<TreeNode> nodes, int edgeLines, int firstSpaces) {
        for (int i = 1; i <= edgeLines; i++) {
            for (TreeNode node : nodes) {
                printSpaces(firstSpaces - i);
                if (node == null) {
                    printSpaces(2 * edgeLines + i + 1);
                    continue;
                }
                if (node.left != null) {
                    System.out.print("/");
                } else {
                    printSpaces(1);
                }
                printSpaces(2 * i - 1);
                if (node.right != null) {
                    System.out.print("\\");
                } else {
                    printSpaces(1);
                }
                printSpaces(2 * edgeLines - i);
            }
            System.out.println();
        }
    }

    private static boolean isAllElementsNull(List<TreeNode> nodes) {
        for (TreeNode node : nodes) {
            if (node != null) {
                return false;
            }
        }
        return true;
    }

    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}
