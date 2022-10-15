fun main() {    
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val h = readLine()!!.toInt()

    print(
        if (h < a) {
            "Deficiency"
        } else if (h > b) {
            "Excess"
        } else {
            "Normal"
        }
    )
}
