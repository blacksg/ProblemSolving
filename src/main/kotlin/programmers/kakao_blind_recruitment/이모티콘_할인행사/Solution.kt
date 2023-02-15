package programmers.kakao_blind_recruitment.이모티콘_할인행사

import java.util.PriorityQueue

class Solution {
    fun solution(users: Array<IntArray>, emoticons: IntArray): IntArray {
        val rates = IntArray(emoticons.size)
        val resultHeap = PriorityQueue(compareByDescending<IntArray> { it[0] }
            .thenByDescending { it[1] })
        
        fun getResult(): IntArray {
            val result = intArrayOf(0, 0)
            userLoop@ for (user in users) {
                var amount = 0
                for (i in emoticons.indices) {
                    if (rates[i] >= user[0]) {
                        amount += emoticons[i] * (100 - rates[i]) / 100
                        if (amount >= user[1]) {
                            result[0]++
                            continue@userLoop
                        }
                    }
                }
                result[1] += amount
            }
            return result
        }
        
        fun dfs(depth: Int) {
            if (depth == emoticons.size) {
                resultHeap.offer(getResult())
                return
            }
            for (rate in 10..40 step 10) {
                rates[depth] = rate
                dfs(depth + 1)
            }
        }
        
        dfs(0)
        return resultHeap.peek()
    }
}