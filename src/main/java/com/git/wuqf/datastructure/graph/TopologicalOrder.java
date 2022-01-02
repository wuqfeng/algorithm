package com.git.wuqf.datastructure.graph;

import com.git.wuqf.datastructure.graph.model.Course;
import com.git.wuqf.datastructure.graph.linkedTable.Graph;

import java.util.Arrays;
import java.util.List;

/**
 * @see<a href="https://github.com/aragorn-wu/algorithm-book/blob/master/tu/tuo-pu-pai-xu.md">说明文档</a>
 */
public class TopologicalOrder {
    public static void main(String[] args) {
        List<Course> cs=constractCourses();
        Graph g=new Graph(cs);

    }

    public static List<Course> constractCourses() {
        List<Course> cs = Arrays.asList(
                new Course("程序设计导论", "c1", null),
                new Course("数值分析", "c2", Arrays.asList("c1", "c14")),
                new Course("数据结构", "c3", Arrays.asList("c1", "c14")),
                new Course("汇编语言", "c4", Arrays.asList("c1", "c13")),
                new Course("自动机理论", "c5", Arrays.asList("c15")),
                new Course("人工智能", "c6", Arrays.asList("c3")),
                new Course("计算机图形学", "c7", Arrays.asList("c3", "c4", "c10")),
                new Course("计算机原理", "c8", Arrays.asList("c4")),
                new Course("算法分析", "c9", Arrays.asList("c3")),
                new Course("高级语言", "c10", Arrays.asList("c3", "c4")),
                new Course("编译系统", "c11", Arrays.asList("c10")),
                new Course("操作系统", "c12", Arrays.asList("c11")),
                new Course("解析几何", "c13", Arrays.asList()),
                new Course("微积分", "c14", Arrays.asList("c13")),
                new Course("线性代数", "c15", Arrays.asList("c14")));
        return cs;
    }
}
