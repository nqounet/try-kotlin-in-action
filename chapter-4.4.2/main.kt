fun main() {
    A.bar()

    val subUser = User.newSubscribingUser("nqou.net@gmail.com")
    println(subUser.nickname)
    val fbUser = User.newFacebookUser(4)
    println(fbUser.nickname)
}
