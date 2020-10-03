fun getFacebookName(id: Int): String {
    return "facebookName$id"
}

class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
            User(email.substringBefore('@'))

        fun newFacebookUser(facebookAccountId: Int) =
            User(getFacebookName(facebookAccountId))
        // fun newFacebookUser(facebookAccountId: Int): User {
        //     return User(getFacebookName(facebookAccountId))
        // }
    }
}

/*
class User {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }
}
 */
