fun boxSort(b: MutableList<Int>) = b.sort()
fun boxSum(b: MutableList<Int>): Int = b[0] + b[1] + b[2]

fun main() {
    val box1 = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    val box2 = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    boxSort(box1)
    boxSort(box2)
    val sumSidesBox1 = boxSum(box1)
    val sumSidesBox2 = boxSum(box2)

    if (sumSidesBox1 < sumSidesBox2) {
        if (box2[0] >= box1[0] && box2[1] >= box1[1] && box2[2] >= box1[2]) {
            println("Box 1 < Box 2")
        } else {
            println("Incomparable")
        }
        } else if (sumSidesBox1 > sumSidesBox2) {
        if (box2[0] <= box1[0] && box2[1] <= box1[1] && box2[2] <= box1[2]) {
            println("Box 1 > Box 2")
        } else {
            println("Incomparable")
        }
        } else if (sumSidesBox1 == sumSidesBox2) {
        if (box2[0] == box1[0] && box2[1] == box1[1] && box2[2] == box1[2]) {
            println("Box 1 = Box 2")
        } else {
            println("Incomparable")
        }
    }
}
