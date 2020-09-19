class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

// カスタムgetter
// 呼び出し時に毎回計算
