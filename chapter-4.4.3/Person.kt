interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Person(val name: String) {
    companion object Loader : JSONFactory<Person> {
        override fun fromJSON(jsonText: String) = Person(jsonText)
    }
}

/*
class Person(val name: String) {
    companion object Loader {
        fun fromJSON(jsonText: String) = Person(jsonText)
    }
}
 */
