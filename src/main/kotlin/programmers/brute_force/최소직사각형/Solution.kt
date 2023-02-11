package programmers.brute_force.최소직사각형

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        return sizes.map { size ->
            intArrayOf(
                size.maxOf { it },
                size.minOf { it }
            )
        }.run {
            maxOf { it[0] } * maxOf { it[1] }
        }
    }
}