fun main() {
    val alice = User("Alice")
    println(alice.nickname)
    println(alice.isSubScribed)

    val bob = User("Bob", false)
    println(bob.nickname)
    println(bob.isSubScribed)

    val carol = User("Carol", isSubScribed = false)
    println(carol.nickname)
    println(carol.isSubScribed)
}
