package programmers.summer_winter_coding.배달

import java.util.PriorityQueue

class Solution {
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        val graph = hashMapOf<Int, MutableList<Pair<Int, Int>>>()
        road.forEach {
            graph.getOrPut(it[0]) { mutableListOf() }.add(it[1] to it[2])
            graph.getOrPut(it[1]) { mutableListOf() }.add(it[0] to it[2])
        }
        val comparator = compareBy<Pair<Int, Int>> { it.second }
        val heap = PriorityQueue(comparator).apply { add(1 to 0) }
        val table = IntArray(N) { if (it == 0) 0 else 500001 }
        while (heap.isNotEmpty()) {
            val current = heap.poll()
            val town = current.first
            val time = current.second
            if (time <= table[town - 1]) {
                for (info in graph[town]!!) {
                    val neighbor = info.first
                    val newTime = time + info.second
                    if (newTime < table[neighbor - 1]) {
                        table[neighbor - 1] = newTime
                        heap.add(neighbor to newTime)
                    }
                }
            }
        }
        return table.count { it <= k }
    }
}