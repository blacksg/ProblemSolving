package programmers.monthly_code_challenge.약수의_개수와_덧셈

class Solution {
    fun solution(left: Int, right: Int): Int {
        return (left..right).sumOf { n ->
            val divisors = (1..n).filter { i -> n % i == 0 }
            if (divisors.size % 2 == 0) n else -n
        }
    }
}