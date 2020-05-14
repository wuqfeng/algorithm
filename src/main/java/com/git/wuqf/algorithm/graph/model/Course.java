package com.git.wuqf.algorithm.graph.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String code;
    private List<String> preCourseCode=new ArrayList<>();

    public Course(String name, String code, List<String> preCourseCode) {
        this.name = name;
        this.code = code;
        this.preCourseCode = preCourseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getPreCourseCode() {
        return preCourseCode;
    }

    public void setPreCourseCode(List<String> preCourseCode) {
        this.preCourseCode = preCourseCode;
    }
}
