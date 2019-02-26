package com.mark.code.kotlin

import java.util.Arrays

/**
 * 977.有序数组的平方
 * 这个题思路是这样的
 * 1.暴力法:创建一个新的数组,然后将给定数组的每个元素平方赋值,然后再排序这个新数组
 * 2.双指针:首先给定的数组是排好序的,我们可以使用i指针从后向前读取负数,用j指针从前向后读取正数
 */
class Code_977 {

    //1.暴力法
    fun sortedSquares(A: IntArray): IntArray {
        val N = A.size
        val ans = IntArray(N)//新建一个数组
        for (i in 0 until N) {
            ans[i] = A[i] * A[i]//将给定数组的每个元素平方,再赋值给新数组
        }

        Arrays.sort(ans)//排序
        return ans
    }

    //2.双指针
    fun sortedSquares2(A: IntArray): IntArray {
        val N = A.size
        var j = 0
        while (j < N && A[j] < 0) {
            j++
        }
        var i = j - 1//得到最后一个负数和第一个正数的Index

        val ans = IntArray(N)
        var t = 0

        while (i >= 0 && j < N) {
            //负数的指针向前走,正数的指针往后走.
            //每次谁的平方小,把谁放到新数组里后,对应指针移动.
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i]
                i--
            } else {
                ans[t++] = A[j] * A[j]
                j++
            }
        }

        //当正数的指针已经走到头后,负数还没走完,直接放负数的平方
        //因为此时剩下的负数的平方都会比数组中任意一个元素大.
        while (i >= 0) {
            ans[t++] = A[i] * A[i]
            i--
        }

        //当负数的指针已经走到头后,正数还没走完,直接放正数的平方
        //因为此时剩下的正数的平方都会比数组中任意一个元素大.
        while (j < N) {
            ans[t++] = A[j] * A[j]
            j++
        }

        return ans
    }

}
