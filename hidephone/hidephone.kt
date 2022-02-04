fun main() {
    println(hidephone("01033334444"))//"*******4444"
    println(hidephone("027778888"))//"*****8888"
}
fun hidephone(phone_number: String): String {
    var answer = ""
    for(i in 0 until phone_number.length) {
        if (i < phone_number.length - 4) {
            answer += "*"
        } else {
            answer += phone_number[i]
        }
    }
    return answer
}
//.withIndex()
//.takeLast()
//.padStart()
