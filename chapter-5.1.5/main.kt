fun salute() = println("Salute!")

fun sendEmail(p: Person, m: String) {
    println("send to $p")
    println("message: $m")
}

fun Person.isAdult() = age >= 21

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 32))
    val getAge = { p: Person -> p.age }
    println(people.maxByOrNull(getAge))

    val getAge2 = Person::age // 関数を値にして渡せる
    println(people.maxByOrNull(getAge2))
    println(people.maxByOrNull(Person::age)) // 直接引数にもできる

    println(people.maxByOrNull(Person::length)) // 関数でもカッコは不要

    run(::salute) // トップレベル関数も指定できる

    val action = { person: Person, message: String -> sendEmail(person, message) }
    val action2 = ::sendEmail
    action(Person("Alice", 29), "Hello")
    action2(Person("Alice", 29), "Hello")

    val createPerson = ::Person // コンストラクタを指定したことになる
    val p = createPerson("Alice", 29)
    println(p)

    val predicate = Person::isAdult // 拡張関数も代入可能
    println(predicate(p))

    val predicate2 = p::isAdult
    println(predicate2())
}
