package programmers.summer_winter_coding.배달

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class SolutionTest {
    
    private val s = Solution()
    
    @Test
    fun test1() {
        val sol = s.solution(
            N = 5, k = 3,
            road = arrayOf(
                intArrayOf(1, 2, 1),
                intArrayOf(2, 3, 3),
                intArrayOf(5, 2, 2),
                intArrayOf(1, 4, 2),
                intArrayOf(5, 3, 1),
                intArrayOf(5, 4, 2),
            )
        )
        assertEquals(sol, 4)
    }
    
    @Test
    fun test2() {
        val sol = s.solution(
            N = 6, k = 4,
            road = arrayOf(
                intArrayOf(1, 2, 1),
                intArrayOf(1, 3, 2),
                intArrayOf(2, 3, 2),
                intArrayOf(3, 4, 3),
                intArrayOf(3, 5, 2),
                intArrayOf(3, 5, 3),
                intArrayOf(5, 6, 1)
            )
        )
        assertEquals(sol, 4)
    }
}