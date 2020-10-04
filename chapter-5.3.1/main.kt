fun main() {
    val people = listOf(Person("Alice", 27), Person("Bob", 32), Person("Carol", 32), Person("Dan", 25))
    println(people.map(Person::name).filter { it.startsWith("A") }) // 全件mapしてからfilterする

    println(
        people.asSequence()
            .map(Person::name) // 中間操作
            .filter { it.startsWith("A") } // 中間操作
            .toList() // 終端操作
    )

    // 終端操作なしの場合は、実行されない
    println("-----")
    listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }

    // map と filter がそれぞれ実行される
    println("-----")
    listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }
        .toList()
    println("")

    // find が終端操作
    println("-----")
    println(
        listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .find { it > 3 }
    )
    println("")

    // filter -> map
    println("-----")
    println(
        people.asSequence()
            .filter { print("filter(${it.name}) "); it.name.length < 4 }
            .map { print("map(${it.name}) "); it.name }
            .toList()
    )
    println("")

    // map -> filter
    println("-----")
    println(
        people.asSequence()
            .map { print("map(${it.name}) "); it.name }
            .filter { print("filter($it) "); it.length < 4 }
            .toList()
    )
    println("")
}
