package com.git.algorithm.graph.linkedTable;

import com.git.algorithm.graph.model.Course;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private Course course;

    private List<Edge> inEdge;
    private List<Edge> outEdge;


    public Vertex(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Edge> getInEdge() {
        return inEdge;
    }

    public void setInEdge(List<Edge> inEdge) {
        this.inEdge = inEdge;
    }
    public void addInEdge(Edge e){
        if(inEdge==null){
            inEdge=new ArrayList<>();
        }
        inEdge.add(e);
    }

    public List<Edge> getOutEdge() {
        return outEdge;
    }

    public void setOutEdge(List<Edge> outEdge) {
        this.outEdge = outEdge;
    }

    public boolean canSort() {
        if(inEdge==null||inEdge.size()==0){
            return true;
        }
        for(Edge ie:inEdge){
            if(!ie.getSortStatus()){
                return false;
            }
        }
        return true;
    }


    public void addOutEdge(Edge e){
        if(outEdge==null){
            outEdge=new ArrayList<>();
        }
        outEdge.add(e);
    }
}
