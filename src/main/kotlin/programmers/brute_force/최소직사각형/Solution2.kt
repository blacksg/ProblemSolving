package programmers.brute_force.최소직사각형

class Solution2 {
    fun solution(sizes: Array<IntArray>): Int {
        val maxLengths = arrayListOf<Int>()
        val minLengths = arrayListOf<Int>()
        for (size in sizes) {
            if (size[0] >= size[1]) {
                maxLengths.add(size[0])
                minLengths.add(size[1])
            } else {
                maxLengths.add(size[1])
                minLengths.add(size[0])
            }
        }
        return maxLengths.maxOf { it } * minLengths.maxOf { it }
    }
}