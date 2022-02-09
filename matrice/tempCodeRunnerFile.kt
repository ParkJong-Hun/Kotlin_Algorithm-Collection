fun main() {
    val a = solution(arrayOf<IntArray>(arrayOf(1,2).toIntArray(), arrayOf(2,3).toIntArray()), arrayOf<IntArray>(arrayOf(3,4).toIntArray(), arrayOf(5,6).toIntArray()))//[[4,6],[7,9]]
    val b =solution(arrayOf<IntArray>(arrayOf(1).toIntArray(),arrayOf(2).toIntArray()),arrayOf<IntArray>(arrayOf(3).toIntArray(),arrayOf(4).toIntArray()))//[[4],[6]]
    for (i in a) {
        print("[")
        for(item in i) {
            print("$item,")
        }
        print("], ")
    }
    println()
    for (i in b) {
        print("[")
        for(item in i) {
            print("$item,")
        }
        print("], ")
    }
    println()
}

fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    return Array(arr1.size) {
        row ->
        IntArray(arr1[0].size) {
            col ->
            arr1[row][col] + arr2[row][col]
        }
    }
}

//size
//Int {var -> contents }