package com.mark.code.java;

/**
 * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 * <p>
 * 你可以返回满足此条件的任何数组作为答案。
 */
public class Code_905 {

    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int startIndex = 0, endIndex = A.length - 1;
        int i = 0;
        //两个下标,一个从前往后放偶数,一个从后往前放奇数.
        while (startIndex <= endIndex) {
            if (A[i] % 2 == 0) {
                result[startIndex] = A[i];
                startIndex++;
            } else {
                result[endIndex] = A[i];
                endIndex--;
            }
            i++;
        }
        return result;
    }
}
