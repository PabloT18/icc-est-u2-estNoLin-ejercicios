package main;

import utils.StudentValidator;
import main.Materia.Models.Node;
import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ
        

    //     InsertBST iB = new InsertBST();

    //     int[] valor1 = {5, 3, 7, 2, 4, 6, 8};
    //     Node root = null;
    //     for (int value : valor1) {
    //         root = iB.insert(root, value);
    //     }

    //     int[] valor2 = {4, 2, 7, 1, 3, 6, 9};
    //     Node root2 = null;
    //     for (int value2 : valor2) {
    //         root2 = iB.insert(root2, value2);
    //     }

    //     int[] valor3 = {4, 2, 7, 1, 3, 6, 9};
    //     Node root3 = null;
    //     for (int value3 : valor3) {
    //         root3 = iB.insert(root3, value3);
    //     }

    //     int[] valor4 = {4, 2, 7, 1, 3, 8};
    //     Node root4 = null;
    //     for (int value4 : valor4) {
    //         root4 = iB.insert(root4, value4);
    //     }

    //     System.out.println("\nEjercicio 01 - BST (inorden):");
    //     printInOrder(root);
    //     System.out.println();

    //     InvertBinaryTree inv = new InvertBinaryTree();
    //     Node invertido = inv.invertTree(copiaArbol(root2));
    //     System.out.println("\nEjercicio 02 - Arbol Invertido (inorden):");
    //     printInOrder(invertido);
    //     System.out.println();

    //     ListLevels lL = new ListLevels();
    //     List<List<Node>> levels = lL.listLevels(root3);
    //     System.out.println("\nEjercicio 03 - Niveles:");

    //     for (List<Node> level : levels) {
    //         for (int i = 0; i < level.size(); i++) {
    //             System.out.print(level.get(i).getValue());
    //             if (i < level.size() - 1) System.out.print(" - ");
    //         }
    //         System.out.println();
    //     }


    //     Depth depth = new Depth();
    //     int maxDepth = depth.maxDepth(root4);
    //     System.out.println("\nEjercicio 04 - Profundidad máxima:");
    //     System.out.println(maxDepth);
    // }

    // public static void printInOrder(Node node) {
    //     if (node == null) return;
    //     printInOrder(node.getLeft());
    //     System.out.print(node.getValue() + " ");
    //     printInOrder(node.getRight());
    // }

    // public static Node copiaArbol(Node root) {
    //     if (root == null) return null;
    //     Node nuevo = new Node(root.getValue());
    //     nuevo.setLeft(copiaArbol(root.getLeft()));
    //     nuevo.setRight(copiaArbol(root.getRight()));
    //     return nuevo;
    //}
    }
}