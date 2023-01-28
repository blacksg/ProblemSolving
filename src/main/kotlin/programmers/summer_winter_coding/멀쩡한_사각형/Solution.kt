package programmers.summer_winter_coding.멀쩡한_사각형

class Solution {
    fun solution(w: Int, h: Int): Long {
        val lw = w.toLong()
        val lh = h.toLong()
        return lw * lh - (lw + lh - gcd(w, h))
    }
    
    tailrec fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}