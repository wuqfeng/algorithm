package com.git.wuqf.algorithm.stringmatch;

import org.junit.jupiter.api.Test;

public class StringMatchTest {
//    String source ="abcdefg";
//    String pattern="ef";
    String source ="BBC ABCDAB ABCDABCDABDE";
    String pattern="ABCDABD";
    @Test
    public void testBruteForce() {
        BruteForce b=new BruteForce();
        int index = b.match(source, pattern);
        System.out.println(index);
    }
}
