fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullname = path.substringAfterLast("/")

    val filename = fullname.substringBeforeLast(".")
    val extension = fullname.substringAfterLast(".")

    println("Dir: $directory, name: $filename, ext: $extension")
}

fun parsePathWithRegex(path: String) {
    // トリプルクォート文字列(triple-quoted string)
    val regex =
        """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main() {
    parsePath("/Users/yole/kotlin-book/chapter.adoc")
    parsePathWithRegex("/Users/yole/kotlin-book/chapter.adoc")
}
