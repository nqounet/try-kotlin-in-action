fun main() {
    val list = listOf(1, 2, 3, 4)
    val filtered = list.filter { it % 2 == 0 }
    val mapped = list.map { it * it }
    println(list)
    println(filtered)
    println(mapped)

    val people = listOf(Person("Alice", 29), Person("Bob", 32))
    println(people)
    println(people.filter { it.age >= 30 })
    println(people.map { it.name })
    println(people.map(Person::name))
    println(people.filter { it.age <30 }.map(Person::name))

    // 毎回計算する悪い例
    println(people.filter { it.age == people.maxByOrNull(Person::age)?.age })
    // マシな例
    val maxAge = people.maxByOrNull(Person::age)?.age
    println(people.filter { it.age == maxAge })

    val people2: Collection<Person> = listOf()
    val maxAge2 = people2.maxByOrNull(Person::age)?.age
    println(people2.filter { it.age == maxAge })

    val numbers = mapOf(0 to "zero", 1 to "one", 2 to "two", 3 to "three")
    println(numbers.mapValues { it.value.toUpperCase() })
    numbers.mapKeys { println(it) } // mapKeys,mapValues はペアで
    numbers.mapValues { println(it) }
    numbers.map { println(it) } // map でも同じ
    numbers.filterKeys { println(it); true } // filter はそれぞれだけ
    numbers.filterValues { println(it); true }
    println(numbers.filterKeys { it % 2 == 0 }.map { "${it.key}:${it.value}" })
}
