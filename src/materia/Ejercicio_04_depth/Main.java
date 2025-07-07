package Materia.Ejercicio_04_depth;

public class Main {
    public static void main(String[] args) {
        TreeDepth.TreeNode root = new TreeDepth.TreeNode(4);
        root.left = new TreeDepth.TreeNode(2);
        root.right = new TreeDepth.TreeNode(7);
        root.left.left = new TreeDepth.TreeNode(1);
        root.left.right = new TreeDepth.TreeNode(3);
        root.left.left.left = new TreeDepth.TreeNode(8); // Profundidad máxima: 4

        System.out.println("Profundidad máxima del árbol: " + TreeDepth.maxDepth(root));
    }
}
