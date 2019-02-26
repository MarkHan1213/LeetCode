package com.mark.code.java;

/**
 * 709题 大写变小写
 */
public class Code_709 {

    public String toLowerCase(String str) {
        //这个题..emmmm ASCII码+32 大写转换成小写
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
