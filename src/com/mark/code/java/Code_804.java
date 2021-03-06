package com.mark.code.java;


import java.util.HashSet;

/**
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。
 * 例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..." + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。
 * 返回我们可以获得所有词不同单词翻译的数量。
 */
public class Code_804 {
    private static String[] map = {
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
    };

    public int uniqueMorseRepresentations(String[] words) {
        if (words == null) return 0;
        HashSet<String> set = new HashSet<String>();
        //遍历整个字符串数组,将每一个字符串中的字符都转为map中对应的密码
        for (String s : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                //c -'a' 即为该字符在map中对应的下标
                sb.append(map[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
