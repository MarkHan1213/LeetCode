package com.mark.code.java;

/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * <p>
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 */
public class Code_461 {

    public int hammingDistance(int x, int y) {
        //toBinaryString()此方法返回int变量的二进制表示的字符串。
        //然后 异或 运算会将相同的地方为0,不同的地方是1
        //替换掉所有的0,得到的String 的长度就是这两个数字对应二进制位不同的位置的数目
//        return Integer.toBinaryString(x ^ y).replaceAll("0", "").length();

        //这么做是让两个数的每一位都与mask进行对比,如果不相同则d++
        //每次比完一位以后mask左移一位
        //速度会快
        int d = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((mask & x) != (mask & y)) {
                d++;
            }
            mask = mask << 1;
        }
        return d;
    }
}
