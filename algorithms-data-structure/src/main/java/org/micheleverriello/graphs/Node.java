package org.micheleverriello.graphs;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public boolean visited;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
        visited = false;
    }
    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
        visited = false;
    }
    public Node(int val, ArrayList<Node> _neighbors) {
        this.val = val;
        neighbors = _neighbors;
        visited = false;
    }
}
