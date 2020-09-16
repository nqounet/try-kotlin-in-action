fun main() {
    println("12.345-6.A".split("\\.|-".toRegex()))

    // 文字列
    println("12.345-6.A".split(".", "-"))

    // 文字
    println("12.345-6.A".split('.', '-'))
}
