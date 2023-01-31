package programmers.summer_winter_coding.소수_만들기

class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        val lastIndex = nums.lastIndex
        for (i in 0..lastIndex - 2) {
            for (j in i + 1..lastIndex - 1) {
                for (k in j + 1..lastIndex) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        answer++
                    }
                }
            }
        }
        return answer
    }
    
    fun isPrime(num: Int): Boolean {
        if (num == 1) {
            return false
        }
        var i = 2
        while (i * i <= num) {
            if (num % i++ == 0) {
                return false
            }
        }
        return true
    }
}