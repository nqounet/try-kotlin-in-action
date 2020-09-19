fun main() {
    val alice = Client("Alice", 342562)
    println(alice)

    val client = Client("Alice", 342562)
    println(alice == client) // equals

    val processed = hashSetOf(Client("Alice", 342562))
    println(processed.contains(Client("Alice", 342562)))

    val bob = alice.copy(name = "Bob")
    println(bob)
}
