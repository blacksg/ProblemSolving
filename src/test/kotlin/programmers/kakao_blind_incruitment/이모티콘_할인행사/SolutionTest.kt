package programmers.kakao_blind_incruitment.이모티콘_할인행사

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class SolutionTest {
    
    private val s = Solution()
    
    @Test
    fun solutionTest1() {
        val sol = s.solution(
            users = arrayOf(
                intArrayOf(40, 10000),
                intArrayOf(25, 10000)
            ),
            emoticons = intArrayOf(7000, 9000)
        )
        assertEquals(1, sol[0])
        assertEquals(5400, sol[1])
    }
    
    @Test
    fun solutionTest2() {
        val sol = s.solution(
            users = arrayOf(
                intArrayOf(40, 2900),
                intArrayOf(23, 10000),
                intArrayOf(11, 5200),
                intArrayOf(5, 5900),
                intArrayOf(40, 3100),
                intArrayOf(27, 9200),
                intArrayOf(32, 6900)
            ),
            emoticons = intArrayOf(1300, 1500, 1600, 4900)
        )
        assertEquals(4, sol[0])
        assertEquals(13860, sol[1])
    }
}