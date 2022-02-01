fun main(x: Int, n: Int): LongArray {
    return Array<Long>(n){i -> (x.toLong() * (i + 1))}.toLongArray()
    //Array를 Long타입으로 생성. 
    //i는 0부터 1씩 증가.
    //x.toLong() * (i + 1)을 Array에 추가
    //위의 내용을 n만큼 반복. 
}