import kotlin.math.pow
import kotlin.math.sqrt
const val PI: Double = 3.14

fun main() {
    when (readLine()!!) {
        "triangle" -> {
            val side1 = readLine()!!.toDouble()
            val side2 = readLine()!!.toDouble()
            val side3 = readLine()!!.toDouble()
            val s = (side1 + side2 + side3) / 2
            print(sqrt(s * (s - side1) * (s - side2) * (s - side3)))
        }
        "rectangle" -> {
            val side1 = readLine()!!.toDouble()
            val side2 = readLine()!!.toDouble()
            print(side1 * side2)
        }
        "circle" -> {
            val r = readLine()!!.toDouble()
            print(PI * r.pow(2))
        }
    }
}