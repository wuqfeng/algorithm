package com.git.wuqf.algorithm.stringmatch;

/**
 * 暴力匹配算法/朴素算法
 */
public class BruteForce implements StringMatch {
    @Override
    public int match(String source, String pattern) {
        int i = 0, j = 0;
        int sourceLength = source.length();
        int patternLength = pattern.length();
        char[] src = source.toCharArray();
        char[] ptn = pattern.toCharArray();
        while (i < sourceLength && j < patternLength) {
            if (src[i] == ptn[j]) {
                i++;
                j++;
            } else {
                // 如果当前字符匹配不成功,则i回溯到此次匹配最开始的位置+1处,也就是i = i - j + 1
                // (因为i,j是同步增长的), j = 0;
                i = i - j + 1;
                j = 0;
            }
        }
        // 匹配成功,则返回模式字符串在原字符串中首次出现的位置;否则返回-1
        if (j == patternLength)
            return i - j;
        else
            return -1;
    }
}
