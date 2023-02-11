package programmers.monthly_code_challenge.나머지가_1이_되는_수_찾기

class Solution {
    fun solution(n: Int): Int {
        var i = 2
        while (i * i <= n - 1) {
            if ((n - 1) % i == 0) {
                return i
            }
            i++
        }
        return n - 1
    }
}