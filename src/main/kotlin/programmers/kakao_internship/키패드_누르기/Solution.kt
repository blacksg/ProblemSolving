package programmers.kakao_internship.키패드_누르기

import kotlin.math.abs

class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        val builder = StringBuilder()
        val positions = intArrayOf(10, 12)
        for (number in numbers) {
            val convertedNumber = if (number == 0) 11 else number
            val finger = when (convertedNumber) {
                1, 4, 7 -> "L"
                3, 6, 9 -> "R"
                else -> {
                    val comparison = getDistance(positions[0], convertedNumber)
                        .compareTo(getDistance(positions[1], convertedNumber))
                    when {
                        comparison < 0 -> "L"
                        comparison > 0 -> "R"
                        else -> if (hand == "left") "L" else "R"
                    }
                }
            }
            builder.append(finger)
            positions[if (finger == "L") 0 else 1] = convertedNumber
        }
        return builder.toString()
    }
    
    private fun getDistance(position: Int, number: Int): Int {
        val abs = abs(position - number)
        return abs / 3 + abs % 3
    }
}