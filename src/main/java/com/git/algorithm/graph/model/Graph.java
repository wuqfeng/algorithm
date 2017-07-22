package com.git.algorithm.graph.model;

import java.util.*;

public class Graph {
    private List<Vertex> vs = new ArrayList<>();
    private List<Edge> edges = new ArrayList<>();
    private List<Vertex> sortedVertex = new ArrayList<>();

    public Graph(List<Course> courses) {

        Map<String, Vertex> vms = new HashMap<>();

        //将course信息放到vertices中
        for (Course course : courses) {
            Vertex v = new Vertex(course);
            vms.put(v.getCourse().getCode(), v);
            vs.add(v);
        }
        Collection<Vertex> it = vms.values();
        for (Vertex v : it) {
            List<String> startVertexCodes = v.getCourse().getPreCourseCode();
            if (startVertexCodes != null && startVertexCodes.size() != 0) {
                for (String code : startVertexCodes) {
                    Vertex startVertex = vms.get(code);
                    Edge e = new Edge(startVertex, v);
                    edges.add(e);
                    v.addInEdge(e);
                    startVertex.addOutEdge(e);
                }
            }
        }
        Iterator<Vertex> its = vs.iterator();
        topologicalOrder();
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public List<Vertex> getSortedVertex() {
        return sortedVertex;
    }

    public void setSortedVertex(List<Vertex> sortedVertex) {
        this.sortedVertex = sortedVertex;
    }

    public void topologicalOrder() {

        Iterator<Vertex> its = vs.iterator();
        while (its.hasNext()) {
            Vertex v = its.next();
            if (v.canSort()) {

                List<Edge> edges = v.getOutEdge();
                if (edges != null) {
                    for (int i = 0; i < edges.size(); i++) {
                        edges.get(i).setSortStatus(true);
                    }
                }
                System.out.println(v.getCourse().getCode());
                sortedVertex.add(v);
                its.remove();
            }
        }
        if (vs.size() > 0) {
            topologicalOrder();
        }
    }
}
