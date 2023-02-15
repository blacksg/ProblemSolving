package programmers.kakao_blind_recruitment.택배_배달과_수거하기

class Solution2 {
    fun solution(cap: Int, n: Int, deliveries: IntArray, pickups: IntArray): Long {
        var answer = 0L
        var deliverySpace = 0
        var pickupSpace = 0
        for (i in n - 1 downTo 0) {
            if (deliveries[i] != 0 || pickups[i] != 0) {
                var visits = 0
                while (deliverySpace < deliveries[i] || pickupSpace < pickups[i]) {
                    visits++
                    deliverySpace += cap
                    pickupSpace += cap
                }
                deliverySpace -= deliveries[i]
                pickupSpace -= pickups[i]
                answer += (i + 1) * visits * 2
            }
        }
        return answer
    }
}