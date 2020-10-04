fun main() {
    val people = listOf(Person("Alice", 27), Person("Bob", 32), Person("Carol", 32))
    println(people.groupBy { it.age }) // Map<Int, List<Person>>

    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first)) // first は拡張関数（らしい）
    println(list.groupBy(String::last))
}
