fun main() {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(2, 3)); { println(42) }() // セミコロンなしだと、一つの命令文として解釈される

    run { println(42) }

    val sum2 = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }
    println(sum2(2, 3))

    val people = listOf(Person("Alice", 29), Person("Bob", 32))
    println(people.maxByOrNull({ p: Person -> p.age }))
    println(people.maxByOrNull() { p: Person -> p.age })
    println(people.maxByOrNull { p: Person -> p.age })
    println(people.maxByOrNull { p -> p.age })
    println(people.maxByOrNull { it.age })

    val getAge = { p: Person -> p.age }
    println(people.maxByOrNull(getAge))

    val names = people.joinToString(separator = " ", transform = { p: Person -> p.name })
    println(names)
    val names2 = people.joinToString(" ") { p: Person -> p.name }
    println(names2)
}
