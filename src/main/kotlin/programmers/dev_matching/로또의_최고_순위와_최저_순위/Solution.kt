package programmers.dev_matching.로또의_최고_순위와_최저_순위

class Solution {
    fun solution(lottos: IntArray, winNums: IntArray): IntArray {
        val unknown = lottos.count { it == 0 }
        val minimumWin = winNums.count { it in lottos }
        return intArrayOf(
            minimumWin + unknown,
            minimumWin
        ).map { count -> if (count == 0) 6 else 7 - count }.toIntArray()
    }
}