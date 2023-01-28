package programmers.kakao_blind_incruitment.택배_배달과_수거하기

import java.util.LinkedList
import kotlin.math.max

class Solution {
    fun solution(cap: Int, n: Int, deliveries: IntArray, pickups: IntArray): Long {
        fun populateQueue(array: IntArray): LinkedList<Int> {
            val queue = LinkedList<Int>()
            var currentLoad = 0
            for (i in n - 1 downTo 0) {
                if (array[i] != 0) {
                    val totalLoad = currentLoad + array[i]
                    val visits = (totalLoad / cap)
                        .plus(if (totalLoad % cap == 0) 0 else 1)
                        .minus(if (currentLoad == 0) 0 else 1)
                    currentLoad = totalLoad % cap
                    repeat(visits) { queue.add(i + 1) }
                }
            }
            return queue
        }
        
        var answer = 0L
        val deliveryQueue = populateQueue(deliveries)
        val pickupQueue = populateQueue(pickups)
        while (deliveryQueue.isNotEmpty() || pickupQueue.isNotEmpty()) {
            answer += max(deliveryQueue.poll() ?: 0, pickupQueue.poll() ?: 0) * 2
        }
        return answer
    }
}