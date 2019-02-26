package com.mark.code.java;

import java.util.HashSet;

/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。  返回重复了 N 次的那个元素。
 * 大小为2N的数组,又有N+1个元素,有一个元素重复了N次,也就是说剩下的N个元素里每一个都不会重复.
 * 所以只需要找出一个重复2次的元素就可以了.
 */
public class Code_961 {

    public int repeatedNTimes(int[] A) {
        //A.length /2 +1 保证 最差情况下也刚好放下
        HashSet<Integer> set = new HashSet<Integer>(A.length / 2 + 1);
        for (int i : A) {
            if (!set.add(i)) {
                return i;
            }
        }
        return 0;
    }
}
