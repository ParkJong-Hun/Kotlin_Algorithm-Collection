fun main() {
    println(solution(listOf(1,2,3,4).toIntArray()))//2.5
    println(solution(listOf(5,5).toIntArray()))//5
}

fun solution(arr: IntArray): Double = arr.average()

//(IntArray).average()