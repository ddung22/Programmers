class Solution {
    fun solution(num1: Int, num2: Int): Int {
        val num2double= num2.toDouble()
        var answer: Double = num1/num2double*1000.0
        return answer.toInt()
    }
}