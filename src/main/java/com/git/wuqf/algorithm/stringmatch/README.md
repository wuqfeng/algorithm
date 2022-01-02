字符串匹配问题的形式定义：

- **文本（Text）**是一个长度为 n 的数组 T[1..n]；
- **模式（Pattern）**是一个长度为 m 且 m≤n 的数组 P[1..m]；
- T 和 P 中的元素都属于有限的**字母表 Σ 表**；
- 如果 0≤s≤n-m，并且 T[s+1..s+m] = P[1..m]，即对 1≤j≤m，有 T[s+j] = P[j]，则说模式 P 在文本 T 中出现且位移为 s，且称 s 是一个**有效位移（Valid Shift）**。

![img](https://images0.cnblogs.com/blog/175043/201410/032208464871566.png)

比如上图中，目标是找出所有在文本 T = abcabaabcabac 中模式 P = abaa 的所有出现。该模式在此文本中仅出现一次，即在位移 s = 3 处，位移 s = 3 是有效位移。

解决字符串匹配的算法包括：[朴素算法（Naive Algorithm）](http://www.cnblogs.com/gaochundong/p/string_matching.html)、Rabin-Karp 算法、有限自动机算法（Finite Automation）、 [Knuth-Morris-Pratt 算法](http://www.cnblogs.com/gaochundong/p/string_matching.html)（即 [KMP Algorithm](https://www.cnblogs.com/gaochundong/p/string_matching.html#kmp_string_matching_algorithm)）、[Boyer-Moore 算法](http://www.cnblogs.com/gaochundong/p/boyer_moore_string_matching_algorithm.html)、Simon 算法、Colussi 算法、Galil-Giancarlo 算法、Apostolico-Crochemore 算法、Horspool 算法和 Sunday 算法等。

- [朴素的字符串匹配算法（Naive String Matching Algorithm）](https://www.cnblogs.com/gaochundong/p/string_matching.html#naive_string_matching_algorithm)
- [Knuth-Morris-Pratt 字符串匹配算法（即 KMP 算法）](https://www.cnblogs.com/gaochundong/p/string_matching.html#kmp_string_matching_algorithm)
- [Boyer-Moore 字符串匹配算法](http://www.cnblogs.com/gaochundong/p/boyer_moore_string_matching_algorithm.html)

字符串匹配算法通常分为两个步骤：预处理（Preprocessing）和匹配（Matching）。所以算法的总运行时间为预处理和匹配的时间的总和。

![img](https://images0.cnblogs.com/blog/175043/201410/032215106443194.png)

上图描述了常见字符串匹配算法的预处理和匹配时间。

## 朴素的字符串匹配算法（Naive String Matching Algorithm）

朴素的字符串匹配算法又称为暴力匹配算法（Brute Force Algorithm），它的主要特点是：

1. 没有预处理阶段；
2. 滑动窗口总是后移 1 位；
3. 对模式中的字符的比较顺序不限定，可以从前到后，也可以从后到前；
4. 匹配阶段需要 O((n - m + 1)m) 的时间复杂度；
5. 需要 2n 次的字符比较；

很显然，朴素的字符串匹配算法 NAIVE-STRING-MATCHER 是最原始的算法，它通过使用循环来检查是否在范围 n-m+1 中存在满足条件 P[1..m] = T [s + 1..s + m] 的有效位移 s。

具体比较过程如下：

![img](https://images0.cnblogs.com/blog/175043/201410/032308498006932.png)