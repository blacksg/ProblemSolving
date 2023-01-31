package programmers.kakao_internship.숫자_문자열과_영단어

class Solution {
    fun solution(s: String): Int {
        return s.replace("zero", "0")
            .replace("one", "1")
            .replace("two", "2")
            .replace("three", "3")
            .replace("four", "4")
            .replace("five", "5")
            .replace("six", "6")
            .replace("seven", "7")
            .replace("eight", "8")
            .replace("nine", "9")
            .toInt()
    }
}