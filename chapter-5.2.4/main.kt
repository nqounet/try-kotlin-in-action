fun main() {
    val books = listOf(
        Book("私の本", listOf("私", "あなた")),
        Book("私の難しい本", listOf("私"))
    )
    println(books.flatMap { it.authors }.toSet())
    println(books.map { it.authors }.flatten().toSet())

    val strings = listOf("abc", "edc")
    println(strings.flatMap { it.toList() })
    println(strings.flatMap { it.toList() }.toSet()) // toSet() は unique にする（本当か？）
    println(strings.map { it.toList() }.flatten())
}
