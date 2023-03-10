package programmers.kakao_blind_recruitment.택배_배달과_수거하기

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {
    
    private val s = Solution()
    
    @Test
    fun solutionTest1() {
        val sol = s.solution(
            cap = 4, n = 5,
            deliveries = intArrayOf(1, 0, 3, 1, 2),
            pickups = intArrayOf(0, 3, 0, 4, 0)
        )
        assertEquals(16L, sol)
    }
    
    @Test
    fun solutionTest2() {
        val sol = s.solution(
            cap = 2, n = 7,
            deliveries = intArrayOf(1, 0, 2, 0, 1, 0, 2),
            pickups = intArrayOf(0, 2, 0, 1, 0, 2, 0)
        )
        assertEquals(30L, sol)
    }
}