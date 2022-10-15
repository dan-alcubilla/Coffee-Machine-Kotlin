import kotlin.math.pow

fun f(x: Double): Double = when {
    x <= 0.0 -> f1(x)
    x >= 1.0 -> f3(x)
    else -> f2(x)
}

fun f1(x: Double): Double {
    return x.pow(2) + 1
}

fun f2(x: Double): Double {
    return 1 / x.pow(2)
}

fun f3(x: Double): Double {
    return x.pow(2) - 1
}