fun main() {
    val num = readLine()!!.toInt()
    var i = 1
    val result = mutableListOf<String>()
    var out = false

    while (!out) {
        repeat(i) {
            if (result.lastIndex - 1 < num) {
                result += i.toString()
            }
            if (result.lastIndex - 1 == num) out = true
        }
        i++
    }
    repeat(result.lastIndex - 1) {
        print("${result[it]} ")
    }
}
