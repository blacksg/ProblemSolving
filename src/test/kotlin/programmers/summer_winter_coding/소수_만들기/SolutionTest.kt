package programmers.summer_winter_coding.소수_만들기

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {
    
    private val s = Solution()
    
    @Test
    fun solutionTest1() {
        val nums = intArrayOf(1, 2, 3, 4)
        val sol = s.solution(nums)
        assertEquals(sol, 1)
    }
    
    @Test
    fun solutionTest2() {
        val nums = intArrayOf(1, 2, 7, 6, 4)
        val sol = s.solution(nums)
        assertEquals(sol, 4)
    }
    
    @Test
    fun primeTest() {
        assertTrue(s.isPrime(2))
        assertTrue(s.isPrime(3))
        assertFalse(s.isPrime(9))
        assertFalse(s.isPrime(16129))
    }
}