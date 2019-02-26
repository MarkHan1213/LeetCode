package com.mark.code.java;

/**
 * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 * <p>
 * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 * <p>
 * 如果 S[i] == "I"，那么 A[i] < A[i+1]
 * 如果 S[i] == "D"，那么 A[i] > A[i+1]
 * 这个题目的意思就是
 * 字符串S长度为N，列表A长度为N+1，
 * 把S看成是A的下标，在A中如果元素下标为I，则下个元素比它大；
 * 如果下标为D，则下个元素比它小。
 */
public class Code_942 {

    public int[] diStringMatch(String S) {
        int[] A = new int[S.length() + 1];//定义长度为N+1的数组
        int min = 0, max = S.length();//A数组中最大值为N,最小值是0
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {//遍历整个字符串
            //如果字符串中第i个元素是I,则让当前的最小值赋值给A,否则将当前最大值付给A
            //对于每个节点，如果下一个节点是增大，则为最小值，否则为最大值。
            A[i] = chars[i] == 'I' ? min++ : max--;
        }
        //最大最小值不断靠拢，最后一个节点时，最大值等于最小值。
        A[chars.length] = min;
        return A;
    }

}
