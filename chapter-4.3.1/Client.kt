class Client(val name: String, val postalCode: Int) {
    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name &&
            postalCode == other.postalCode
    }
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}
