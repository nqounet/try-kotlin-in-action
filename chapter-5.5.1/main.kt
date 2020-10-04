fun alphabet(): String {
    val stringBuilder = StringBuilder()
    for (letter in 'A'..'Z') {
        stringBuilder.append(letter)
    }
    stringBuilder.append("\nNow I know the alphabet!")
    return stringBuilder.toString()
}

fun alphabet2(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        this.append("\nNow I know the alphabet!")
        this.toString()
    }
}

fun alphabet3() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

fun main() {
    println(alphabet())
    println(alphabet2())
    println(alphabet3())
}
