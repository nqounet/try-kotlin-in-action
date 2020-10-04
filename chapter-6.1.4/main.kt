fun strLenSafe(s: String?) = s?.length ?: 0

fun printShippingLabel(person: Person) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("No Address")
    with(address) {
        println(streetAddress)
        println("$zipcode $city, $country")
    }
}

fun main() {
    println(strLenSafe(null))
    println(strLenSafe("nqou.net"))

    val address = Address("Elster. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)
    printShippingLabel(person)

    printShippingLabel(Person("Alex", null))
}
