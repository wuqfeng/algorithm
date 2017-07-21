package com.git.algorithm.graph.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private List<Vertex> vertices;
    private List<Edge> edges;

    public Graph(List<Course> courses) {

        Map<String,Vertex> vms=new HashMap<>();

        //将course信息放到vertices中
        for (Course course : courses) {
            Vertex v = new Vertex(course);
            vertices.add(v);
            vms.put(v.getCourse().getCode(),v);
        }
        for(Vertex v:vertices){
            List<String> startVertexCodes=v.getCourse().getPreCourseCode();
            for(String code:startVertexCodes){
                Vertex startVertex=vms.get(code);
                Edge e=new Edge(startVertex,v);
                edges.add(e);
                v.addInEdge(e);
                startVertex.addOutEdge(e);

            }
        }

    }


    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
}
