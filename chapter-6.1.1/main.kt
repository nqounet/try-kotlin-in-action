fun strLen(s: String) = s.length

fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0

fun main() {
    // strLen(null) // error: null can not be a value of a non-null type String
    println(strLen("abc"))

    println(strLenSafe(null))
    println(strLenSafe("abc"))
}
