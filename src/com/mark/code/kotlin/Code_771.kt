package com.mark.code.kotlin

/**
 * leetcode 上的771题,宝石与石头,题意就是 S中有多少个J的元素.
 * 我直接用了kotlin自带的函数.
 * 唉. 工作原因,心累.
 * 老哥们看Java那边的改吧
 */
class Code_771 {

    fun numJewelsInStones(J: String, S: String): Int {
        var sum = 0

        S.forEach { v ->
            if (J.find { it == v } != null) {
                sum++
            }
        }

        return sum
    }

}