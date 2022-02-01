fun main(args: Array<String>) {
    val (a,b) = readLine()!!.split(' ').map { it.toInt() }
    val answer = solution(a, b)
    print("[")
    for (i in answer) {
        print("$i, ")
    }
    print("]")
}

fun solution(x: Int, n: Int): LongArray {
    return Array<Long>(n){i -> (x.toLong() * (i + 1))}.toLongArray()
    //Array를 Long타입으로 생성. 
    //i는 0부터 1씩 증가.
    //x.toLong() * (i + 1)을 Array에 추가
    //위의 내용을 n만큼 반복.
    //Array<Long>을 LongArray로 변환 
}