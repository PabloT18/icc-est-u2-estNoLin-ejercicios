package Materia.Ejercicio_01_insert;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        for (int val : values) {
            bst.insert(val);
        }

        System.out.println("Árbol en orden:");
        bst.printInOrder(); // Salida: 2 3 4 5 6 7 8
    }
}
