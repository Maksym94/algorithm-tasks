package trees.two.sum_653;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Solution {

    public boolean findTarget(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        findTarget(root, values);
        int idxLeft = 0;
        int idxRight = values.size() - 1;
        while (idxLeft < idxRight) {
            int leftVal = values.get(idxLeft);
            int rightVal = values.get(idxRight);
            int sum = leftVal + rightVal;
            if (sum == k) {
                return true;
            } else if (sum < k) {
                idxLeft++;
            } else {
                idxRight--;
            }
        }
        return false;
    }

    public boolean findTargetBfs(TreeNode root, int k) {
        Queue<TreeNode> trees = new LinkedList<>();
        Set<Integer> values = new HashSet<>();
        if (root != null) {
            trees.add(root);
        }
        while (!trees.isEmpty()) {
            TreeNode current = trees.poll();
            if (current != null) {
                int val = current.val;
                int diff = k - val;
                if (values.contains(diff)) {
                    return true;
                }
                values.add(val);
                if (current.left != null) {
                    trees.add(current.left);
                }
                if (current.right != null) {
                    trees.add(current.right);
                }
            }
        }
        return false;
    }

    public boolean findTargetSet(TreeNode root, int k) {
        Set<Integer> values = new HashSet<>();
        return findTargetSet(root, k, values);
    }

    private static void findTarget(TreeNode root, List<Integer> values) {
        if (root != null) {
            findTarget(root.left, values);
            values.add(root.val);
            findTarget(root.right, values);
        }
    }

    private static boolean findTargetSet(TreeNode root, int k, Set<Integer> values) {
        if (root != null) {
            int val = root.val;
            int diff = k - val;
            if (values.contains(diff)) {
                return true;
            }
            values.add(val);
            return findTargetSet(root.left, k, values) || findTargetSet(root.right, k, values);
        }
        return false;
    }
}


