package Materia.Ejercicio_02_invert;

public class Main {
    public static void main(String[] args) {
        TreeInverter.Node root = new TreeInverter.Node(4);
        root.left = new TreeInverter.Node(2);
        root.right = new TreeInverter.Node(7);
        root.left.left = new TreeInverter.Node(1);
        root.left.right = new TreeInverter.Node(3);
        root.right.left = new TreeInverter.Node(6);
        root.right.right = new TreeInverter.Node(9);

        System.out.println("Árbol invertido (in-order):");
        TreeInverter.printTree(TreeInverter.invertTree(root));
    }
}
