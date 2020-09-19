class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)
}

// 初期化時に一度だけ計算
