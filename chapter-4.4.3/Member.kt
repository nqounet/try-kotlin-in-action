// domain model
data class Member(val firstName: String, val lastName: String) {
    companion object {}
}

// infra
fun Member.Companion.fromJSON(json: String): Member {
    return Member(json, json)
}
