package com.mark.code.kotlin


/**
 * 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在 (0, 0) 处结束。
 *
 *
 * 移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有 R（右），L（左），U（上）和 D（下）。如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
 *
 *
 * 注意：机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。此外，假设每次移动机器人的移动幅度相同。
 */
class Code_657 {

    fun judgeCircle(moves: String): Boolean {
        var h = 0
        var v = 0
        //记录水平和竖直方向的唯一,R+1,L-1.U+1D-1;这样最后判断位移位置是否都为0.
        // 如果均为零,则证明,机器人移动后的位置跟移动前没有变化.
        val array = moves.toCharArray()
        for (c in array) {
            when (c) {
                'R' -> h++
                'L' -> h--
                'U' -> v++
                'D' -> v--
            }
        }
        return h == 0 && v == 0
    }
}
