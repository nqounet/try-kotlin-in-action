class DelegatingCollection<T>(
    innerList: Collection<T> = ArrayList<T>()
) : Collection<T> by innerList

// class DelegatingCollection<T> : Collection<T> {
//     private val innerList = arrayListOf<T>()

//     override val size: Int get() = innerList.size
//     override fun isEmpty(): Boolean = innerList.isEmpty()
//     override fun contains(element: T): Boolean = innerList.contains(element)
//     override fun iterator(): Iterator<T> = innerList.iterator()
//     override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)
// }

// この書き方は参考に留める
// val で宣言されていない
// innerList に入る値？が異なっている（arrayListOf と ArrayList）
// Array と List と Collection の違いは？
