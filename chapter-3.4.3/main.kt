fun main() {
    val map = mapOf(1 to "one", 7.to("seven"), 53 to "fifty-three")
    println(map)

    // 分解宣言（destructuring declaration）
    val(number, name) = 1 to "one"
    println(number)
    println(name)
}

// 中置呼び出し（infix call）
infix fun Any.to(other: Any) = Pair(this, other)

// mapOf関数の宣言
// fun <K, V> mapOf(vararg values: Pair<K, V>): Map<K, V>
