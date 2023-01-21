package programmers.summer_winter_coding.멀쩡한_사각형

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {
    
    private val s = Solution()
    
    @Test
    fun solutionTest() {
        assertEquals(s.solution(8, 12), 80)
    }
    
    @Test
    fun gcdTest() {
        assertEquals(s.gcd(3, 2), 1)
        assertEquals(s.gcd(2, 5), 1)
        assertEquals(s.gcd(8, 12), 4)
        assertEquals(s.gcd(1, 1), 2)
    }
}