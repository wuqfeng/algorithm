package com.git.algorithm.graph.model;

public class Edge {
    private Vertex startVertex;
    private Vertex endVertex;
    private boolean sortStatus =false;

    public Edge(Vertex startVertex, Vertex endVertex) {
        this.startVertex = startVertex;
        this.endVertex = endVertex;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public Vertex getEndVertex() {
        return endVertex;
    }

    public void setEndVertex(Vertex endVertex) {
        this.endVertex = endVertex;
    }

    public boolean getSortStatus() {
        return sortStatus;
    }

    public void setSortStatus(boolean sortStatus) {
        this.sortStatus = sortStatus;
    }
}
