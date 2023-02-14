package programmers.monthly_code_challenge.내적

class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        return a.indices.sumOf { i -> a[i] * b[i] }
    }
}