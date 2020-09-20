class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}

// 本では elements を c としていたが、コンパイルエラーが発生した
// CountingSet.kt:11:25: warning: the corresponding parameter in the supertype 'MutableCollection' is named 'elements'. This may cause problems when calling this function with named arguments.
//     override fun addAll(c: Collection<T>): Boolean {
//                         ^
// 名前付きで呼ばれることを想定して、 override する場合には同じ変数名である必要がある、というような理由
