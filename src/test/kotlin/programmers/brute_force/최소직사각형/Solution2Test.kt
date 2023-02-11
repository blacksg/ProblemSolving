package programmers.brute_force.최소직사각형

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Solution2Test {
    
    private val s = Solution2()
    
    @Test
    fun test1() {
        val sizes = arrayOf(
            intArrayOf(60, 50),
            intArrayOf(30, 70),
            intArrayOf(60, 30),
            intArrayOf(80, 40)
        )
        val solution = s.solution(sizes)
        assertEquals(4000, solution)
    }
}