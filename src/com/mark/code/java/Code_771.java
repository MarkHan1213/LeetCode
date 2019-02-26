package com.mark.code.java;

/**
 * leetcode 上的771题,宝石与石头,题意就是 S中有多少个J的元素.
 * exp:     1 J= "aA", S = "aAAbbbb" =>3
 *          2 J = "z", S = "ZZ"      =>0
 */
public class Code_771 {

    private int numJewelsInStones(String J,String S) {
        if (J == null || S == null) return 0;
        int sum = 0;
        char[] A = J.toCharArray();
        char[] B = S.toCharArray();

        boolean[] Ab = new boolean[128];
        for (char c : A) {
            Ab[c] = true;
        }
        int cnt = 0;
        for (char c : B) {
            if (Ab[c]) {
                ++cnt;
            }
        }
        return cnt;
    }

}
