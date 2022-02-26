fun main() {
    println(factorial(5, 1))
}

tailrec fun factorial(n: Int, acc: Int): Int {
    return if (n <= 0) {
        acc
    } else {
        factorial(n-1, n*acc)
    }
}