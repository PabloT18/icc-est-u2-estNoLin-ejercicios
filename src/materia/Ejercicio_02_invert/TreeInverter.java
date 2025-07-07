package Materia.Ejercicio_02_invert;

public class TreeInverter {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    public static Node invertTree(Node root) {
        if (root == null) return null;

        Node temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    public static void printTree(Node root) {
        if (root == null) return;
        printTree(root.left);
        System.out.print(root.value + " ");
        printTree(root.right);
    }
}
