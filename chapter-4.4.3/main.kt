fun main() {
    val json = Person.Loader.fromJSON("JSON")
    println(json.name)

    println(Person.fromJSON("fromJSON").name)

    val member = Member.fromJSON("JSON")
    println(member)
}

/*
TODO: 文法不明。これは何をするのだろう？
fun loadFromJSON <T> (factory: JSONFactory<T>): T { TODO("todo") }
loadFromJSON(Person)
 */
