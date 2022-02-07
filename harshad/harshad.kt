fun main() {
    println(solution(10))//true
    println(solution(12))//true
    println(solution(11))//false
    println(solution(13))//false
}

fun solution(x : Int): Boolean {
    var sum = 0
    for(ch in "$x") {
        sum += Character.getNumericValue(ch)
    }
    print(sum)
    return x % sum == 0
}