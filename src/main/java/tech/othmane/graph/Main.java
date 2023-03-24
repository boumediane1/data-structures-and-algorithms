package tech.othmane.graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addEdge("A", "B");
        System.out.println(graph);
    }
}
