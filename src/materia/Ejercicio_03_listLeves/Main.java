package Materia.Ejercicio_03_listLeves;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LevelLinkedLists.TreeNode root = new LevelLinkedLists.TreeNode(4);
        root.left = new LevelLinkedLists.TreeNode(2);
        root.right = new LevelLinkedLists.TreeNode(7);
        root.left.left = new LevelLinkedLists.TreeNode(1);
        root.left.right = new LevelLinkedLists.TreeNode(3);
        root.right.left = new LevelLinkedLists.TreeNode(6);
        root.right.right = new LevelLinkedLists.TreeNode(9);

        List<LinkedList<Integer>> levels = LevelLinkedLists.createLevelLists(root);

        int depth = 0;
        for (LinkedList<Integer> level : levels) {
            System.out.print("Nivel " + depth++ + ": ");
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
