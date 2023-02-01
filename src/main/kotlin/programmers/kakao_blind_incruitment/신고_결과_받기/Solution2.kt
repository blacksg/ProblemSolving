package programmers.kakao_blind_incruitment.신고_결과_받기

class Solution2 {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val distinctReports = report.distinct().map { it.split(" ") }
        val suspendedReports = distinctReports.groupBy { it[1] }
            .asSequence()
            .map { it.value }
            .filter { it.size >= k }
            .flatten()
        val reportCounts = suspendedReports.map { it[0] }
            .groupingBy { it }
            .eachCount()
        return id_list.map { reportCounts.getOrDefault(it, 0) }.toIntArray()
    }
}