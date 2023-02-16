package programmers.brute_force.모의고사

class Solution {
    fun solution(answers: IntArray): IntArray {
        val pattern1 = intArrayOf(1, 2, 3, 4, 5)
        val pattern2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val pattern3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        val counts = arrayListOf(0, 0, 0)
        answers.forEachIndexed { i, answer ->
            if (answer == pattern1[i % pattern1.size]) {
                counts[0]++
            }
            if (answer == pattern2[i % pattern2.size]) {
                counts[1]++
            }
            if (answer == pattern3[i % pattern3.size]) {
                counts[2]++
            }
        }
        val maxCount = counts.maxOf { it }
        return counts.withIndex()
            .filter { it.value == maxCount }
            .map { it.index + 1 }
            .toIntArray()
    }
}