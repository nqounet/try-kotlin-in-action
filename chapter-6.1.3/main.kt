fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase() // allCaps は null許容型にせざるを得ない
    println(allCaps)
}

fun managerName(employee: Employee) = employee.manager?.name

fun Person.countryName(): String {
    val country = this.company?.address?.country
    return if (country != null) country else "Unknown"
}

fun main() {
    printAllCaps(null)
    printAllCaps("null")

    val ceo = Employee("Da Boss", null)
    val developer = Employee("Alan Smithy", ceo)
    println(managerName(developer))
    println(managerName(ceo))

    val person = Person("Dmitry", null)
    println(person.countryName())
}
