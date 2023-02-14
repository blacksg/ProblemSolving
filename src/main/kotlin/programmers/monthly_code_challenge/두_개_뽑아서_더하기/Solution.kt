package programmers.monthly_code_challenge.두_개_뽑아서_더하기

class Solution {
    fun solution(numbers: IntArray): IntArray {
        val generatedNumbers = arrayListOf<Int>()
        for (i in 0..numbers.lastIndex - 1) {
            for (j in i + 1..numbers.lastIndex) {
                generatedNumbers.add(numbers[i] + numbers[j])
            }
        }
        return generatedNumbers.distinct()
            .sorted()
            .toIntArray()
    }
}