package programmers.kakao_internship.크레인_인형뽑기_게임

import java.util.Stack

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var points = 0
        val basket = Stack<Int>()
        moveLoop@ for (move in moves) {
            for (row in board) {
                val plush = row[move - 1]
                if (plush != 0) {
                    if (basket.isNotEmpty() && plush == basket.peek()) {
                        basket.pop()
                        points += 2
                    } else {
                        basket.push(plush)
                    }
                    row[move - 1] = 0
                    continue@moveLoop
                }
            }
        }
        return points
    }
}