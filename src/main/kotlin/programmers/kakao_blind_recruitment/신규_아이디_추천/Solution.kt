package programmers.kakao_blind_recruitment.신규_아이디_추천

class Solution {
    fun solution(new_id: String): String {
        return new_id.lowercase()
            .removeInvalidCharacters()
            .removeDuplicatedPeriods()
            .removeSurroundingPeriods()
            .fillIfEmpty()
            .trimAndRemoveSuffixPeriod()
            .extend()
    }
    
    private fun String.removeInvalidCharacters(): String {
        return this.replace(Regex("[^a-z\\d-_.]"), "")
    }
    
    private fun String.removeDuplicatedPeriods(): String {
        return this.replace(Regex("\\.{2,}"), ".")
    }
    
    private fun String.removeSurroundingPeriods(): String {
        return this.removePrefix(".").removeSuffix(".")
    }
    
    private fun String.fillIfEmpty(): String {
        if (this.isEmpty()) {
            return "a"
        }
        return this
    }
    
    private fun String.trimAndRemoveSuffixPeriod(): String {
        if (this.length > 15) {
            return this.substring(0, 15).removeSuffix(".")
        }
        return this
    }
    
    private fun String.extend(): String {
        if (this.length < 3) {
            val builder = StringBuilder(this)
            while (builder.length < 3) {
                builder.append(this.last())
            }
            return builder.toString()
        }
        return this
    }
}