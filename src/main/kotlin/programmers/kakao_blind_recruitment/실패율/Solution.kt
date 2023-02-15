package programmers.kakao_blind_recruitment.실패율

class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val failureRateInfo = Array(N) { FloatArray(2) { 0F } }
        for (stage in stages) {
            for (i in 0..stage - 2) {
                failureRateInfo[i][1]++
            }
            if (stage < N + 1) {
                failureRateInfo[stage - 1][0]++
            }
        }
        val failureRates = failureRateInfo.map { info ->
            val reached = info[0] + info[1]
            val failed = info[0]
            if (reached == 0F) 0F else failed / reached
        }
        return failureRates.withIndex()
            .sortedByDescending { it.value }
            .map { it.index + 1 }
            .toIntArray()
    }
}