package programmers.monthly_code_challenge.음양_더하기

class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        return absolutes.foldIndexed(0) { index, acc, abs ->
            acc + if (signs[index]) abs else -abs
        }
    }
}