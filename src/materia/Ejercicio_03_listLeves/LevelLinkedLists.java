package Materia.Ejercicio_03_listLeves;

import java.util.*;

public class LevelLinkedLists {
    static class TreeNode {
        int value;
        TreeNode left, right;

        TreeNode(int val) {
            value = val;
            left = right = null;
        }
    }

    public static List<LinkedList<Integer>> createLevelLists(TreeNode root) {
        List<LinkedList<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.value);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            result.add(level);
        }

        return result;
    }
}
