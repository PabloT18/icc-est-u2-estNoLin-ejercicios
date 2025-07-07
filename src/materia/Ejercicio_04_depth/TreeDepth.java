package Materia.Ejercicio_04_depth;

public class TreeDepth {
    static class TreeNode {
        int value;
        TreeNode left, right;

        TreeNode(int val) {
            value = val;
            left = right = null;
        }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
