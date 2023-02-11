package programmers.monthly_code_challenge.없는_숫자_더하기

class Solution {
    fun solution(numbers: IntArray): Int {
        return (0..9).sum() - numbers.sum()
    }
}