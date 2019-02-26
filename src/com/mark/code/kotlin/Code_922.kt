package com.mark.code.kotlin

/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 */
class Code_922 {

    fun sortArrayByParityII(A: IntArray): IntArray {
        var i = 1
        var j = 0
        while (j < A.size - 1) {
            // &1 != 0 证明 这个数的最后一位是1.所以不是偶数.
            if (A[j] and 1 != 0) {
                while (A[i] and 1 != 0) {
                    i += 2
                }
                val tmp = A[j]
                A[j] = A[i]
                A[i] = tmp
            }
            j += 2

        }
        return A
    }


}
