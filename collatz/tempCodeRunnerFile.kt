fun main() {
    println(solution(6))//8
    println(solution(16))//4
    println(solution(626331))//-1
}

fun solution(num: Int): Int {
    var count = 0
    var result = 0
    var temp = num.toLong()
    while(true) {
        count++
        if(count >= 500) {
            return -1
        } else if(temp == 1) {
            return result
        }
        if(temp%2.toLong() == 0.toLong()) {
            temp /= 2
        } else {
            temp = temp * 3 + 1
        }
        result++
    }
}
//tailrec