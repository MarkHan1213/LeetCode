package com.mark.code.kotlin

/**
 * 给出一个整数数组 A 和一个查询数组 queries。
 *
 * 对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，我们会把 val 加到 A[index] 上。然后，第 i 次查询的答案是 A 中偶数值的和。
 *
 * （此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。）
 *
 * 返回所有查询的答案。你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。
 */
class Code_985 {


    fun sumEvenAfterQueries(A: IntArray, queries: Array<IntArray>): IntArray {
        var sum = 0
        for (a in A) {
            if (a % 2 == 0) sum += a//首先算出当前数组中所有偶数之和.
        }
        val ans = IntArray(queries.size)
        for (i in ans.indices) {
            val `val` = queries[i][0]
            val index = queries[i][1]
            var num = A[index]
            //从queries中取出要修改多少值,以及修改目标的index
            if (num % 2 == 0) sum -= num
            num += `val`
            if (num % 2 == 0) sum += num
            //因为要求要修改数组A,所以再给赋值过去
            A[index] = num
            ans[i] = sum
        }
        return ans
    }
}
