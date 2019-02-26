package com.mark.code.kotlin

/**
 * 709题 大写变小写
 */
class Code_709 {

    fun toLowerCase(str: String): String {
        //这个题..emmmm ASCII码+32 大写转换成小写
        val lowString = StringBuilder()
        str.forEach {
            lowString.append(if (it in 'A'..'Z') it + 32 else it)
        }
        return lowString.toString()
    }
}
