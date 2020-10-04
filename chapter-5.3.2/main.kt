import java.io.File

fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }
fun File.findInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.find { it.isHidden }

fun main() {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())

    val file = File("/Users/nobu/.zplug/doc/zplug.txt")
    println(file.isInsideHiddenDirectory())
    println(file.findInsideHiddenDirectory())
}
