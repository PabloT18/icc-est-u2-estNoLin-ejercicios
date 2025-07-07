package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {

        public List<List<Node>> listLevels(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Node>> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                currentLevel.add(current);
                if (current.getLeft() != null) {
                    queue.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    queue.add(current.getRight());
                }
            }
            result.add(currentLevel);
        }

        return result;
    }
    
}
