package com.mark.code.java;

/**
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * <p>
 * 注意:
 * <p>
 * 给定的整数保证在32位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 */
public class Code_476 {

    public int findComplement(int num) {
        //补数是对该数的二进制表示取反
        //所以即 0 ->1;1->0;
        //给定一个数,假设为101 他的补数为010;
        //我们可以看到,101 与111 取异或 ;就为010;
        //c就是一个位数和num一直全为1的正数.
        //跟num异或后,即为num的补数
        int temp = num, c = 0;
        while (temp > 0) {
            temp >>= 1;
            c = (c << 1) + 1;
        }
        return num ^ c;
    }
}
