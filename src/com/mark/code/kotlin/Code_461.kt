package com.mark.code.kotlin

/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *
 *
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 */
class Code_461 {

    fun hammingDistance(x: Int, y: Int): Int {
        //toBinaryString()此方法返回int变量的二进制表示的字符串。
        //然后 异或 运算会将相同的地方为0,不同的地方是1
        //替换掉所有的0,得到的String 的长度就是这两个数字对应二进制位不同的位置的数目
//        return Integer.toBinaryString(x xor y).replace("0".toRegex(), "").length

        //这么做是让两个数的每一位都与mask进行对比,如果不相同则d++
        //每次比完一位以后mask左移一位
        //速度会快
        var d = 0
        var mask = 1
        for (i in 0..31) {
            if (mask and x != mask and y) {
                d++
            }
            mask = mask shl 1
        }
        return d
    }
}
