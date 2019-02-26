package com.mark.code.java;

/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * <p>
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * <p>
 * 你可以返回任何满足上述条件的数组作为答案。
 */
public class Code_922 {

    public int[] sortArrayByParityII(int[] A) {
        int i = 1;
        for (int j = 0; j < A.length - 1; j = j + 2) {
            // &1 != 0 证明 这个数的最后一位是1.所以不是偶数.
            if ((A[j] & 1) != 0) {
                while ((A[i] & 1) != 0){
                    i=i+2;
                }
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
            }

        }
        return A;
    }


}
