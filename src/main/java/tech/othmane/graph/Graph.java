package tech.othmane.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<String, List<String>> adjacencyList = new HashMap<>();

    public boolean addVertex(String vertex) {
        if(this.adjacencyList.get(vertex) == null) {
            this.adjacencyList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "\n\tadjacencyList=" + adjacencyList +
                "\n}";
    }
}
