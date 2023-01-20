package programmers.summer_winter_coding.소수_만들기

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class SolutionTest {
    
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4)
        val s = Solution().solution(nums)
        assertEquals(s, 1)
    }
    
    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 7, 6, 4)
        val s = Solution().solution(nums)
        assertEquals(s, 4)
    }
}