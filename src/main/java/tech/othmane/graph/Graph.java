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

    public boolean addEdge(String vertex1, String vertex2) {
        if(this.adjacencyList.get(vertex1) != null && this.adjacencyList.get(vertex2) != null) {
            this.adjacencyList.get(vertex1).add(vertex2);
            this.adjacencyList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if(this.adjacencyList.get(vertex1) != null && this.adjacencyList.get(vertex2) != null) {
            this.adjacencyList.get(vertex1).remove(vertex2);
            this.adjacencyList.get(vertex2).remove(vertex1);
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
