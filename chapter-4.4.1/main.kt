import java.io.File

fun main() {
    Payroll.allEmployees.add(Person("nqounet"))
    Payroll.calculateSalary()

    println(
        CaseInsensitiveFileComparator.compare(
            File("/user"),
            File("/User")
        )
    )

    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))

    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
}
