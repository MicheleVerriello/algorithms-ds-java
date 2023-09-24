package org.micheleverriello.graphs;

import java.util.ArrayDeque;

public class GraphOperations implements IGraphOperations {

    @Override
    public void depthFirstTraversal(Node node) {
        if(node != null) {
            System.out.println(node.val);
            node.visited = true;
            for (Node neighbour: node.neighbors) {
                if(neighbour.visited == false) {
                    depthFirstTraversal(node);
                }
            }
        }
    }

    @Override
    public void breadthFirstTraversal(Node node) {
        ArrayDeque<Node> queue = new ArrayDeque<>();
        if(node != null) {
            node.visited = true;
            queue.addFirst(node);
            while (!queue.isEmpty()) {
                Node current = queue.removeLast();
                System.out.println(current.val);
                for (Node n: current.neighbors)
                    if (!n.visited) {
                        n.visited = true;
                        queue.addFirst(n);
                    }

            }
        }
    }
}
