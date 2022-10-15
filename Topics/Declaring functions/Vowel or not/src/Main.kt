fun isVowel(let: Char): Boolean {
    val vowel = let.toLowerCase()
    val vowels = mutableListOf('a', 'e', 'i', 'o', 'u')
    return vowel in vowels
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
