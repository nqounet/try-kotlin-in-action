val canBeInClub27 = { p: Person -> p.age <= 27 }
fun main() {
    val people = listOf(Person("Alice", 27), Person("Bob", 32))
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
    println(people.count(canBeInClub27))
    println(people.filter(canBeInClub27).size) // 中間コレクションを作成してしまうので、sizeだけが必要ならcountがよい

    println(!people.all { it.age ==32 }) // `!` は場所によっては目立たない
    println(people.any { it.age != 32 }) // !all は any を使って書くことができる

    println(people.find(canBeInClub27))
    println(people.firstOrNull(canBeInClub27)) // find の同意語
}
