fun main() {
    val kotlinLogo =
        """| //
                       .|//
                       .|/ \"""
    println(kotlinLogo.trimMargin("."))

    val price =
        """${'$'}99.99"""
    println(price)

    val windowsPath =
        """C:\Users\yole\kotlin-book"""
    println(windowsPath)

    val windowsPath2 =
        """C:\\Users\\yole\\kotlin-book"""
    println(windowsPath2)
}
