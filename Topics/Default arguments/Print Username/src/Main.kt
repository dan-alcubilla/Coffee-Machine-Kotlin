fun username(name: String = "secret user") {
    print("Hello, $name!")
}

fun main() {
    val nameHacker = readLine()!!
    if (nameHacker == "HIDDEN") {
        username()
    } else {
        username(nameHacker)
    }
}