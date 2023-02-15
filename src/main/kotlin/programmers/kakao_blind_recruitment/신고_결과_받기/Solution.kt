package programmers.kakao_blind_recruitment.신고_결과_받기

class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val answer = IntArray(id_list.size) { 0 }
        val targetListMap = hashMapOf<String, ArrayList<String>>()
        val reportCountMap = hashMapOf<String, Int>()
        for (record in report.distinct()) {
            val (reporter, target) = record.split(" ").let { it[0] to it[1] }
            targetListMap.getOrPut(reporter) { arrayListOf() }.add(target)
            reportCountMap[target] = reportCountMap.getOrDefault(target, 0) + 1
        }
        for (i in id_list.indices) {
            targetListMap[id_list[i]]?.forEach {
                if (reportCountMap[it]!! >= k) {
                    answer[i]++
                }
            }
        }
        return answer
    }
}

