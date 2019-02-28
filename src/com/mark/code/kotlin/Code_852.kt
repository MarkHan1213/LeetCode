package com.mark.code.kotlin

/**
 * 山脉数组,求下标
 */
class Code_852 {

    fun peakIndexInMountainArray(A: IntArray): Int {
        //给定的A是依次递增到最大值以后递减.所以
        //暴力点,直接判断某一个数比它后面那位大,则它就是最大值
        //直接返回下标
        for (i in 0 until A.size - 1) {
            if (A[i] > A[i + 1]) return i
        }
        return -1
    }
}
