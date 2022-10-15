fun main() {
    var available = readLine()!!.toInt()
    val payments = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    var noShow = false

    for (i in 0..payments.lastIndex) {
        if (available >= payments[i]) {
            available -= payments[i]
        } else {
            print(
                "Error, insufficient funds for the purchase. Your balance is $available, but you need ${payments[i]}."
            )
            noShow = true
            break
        }
    }

    if (!noShow) {
        print("Thank you for choosing us to manage your account! Your balance is $available.")
    }
}
