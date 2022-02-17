fun main() {
    println(solution("a234"))//false
    println(solution("1234"))//true
}

fun solution(s: String): Boolean {
    return s.toIntOrNull().toString() == s
}