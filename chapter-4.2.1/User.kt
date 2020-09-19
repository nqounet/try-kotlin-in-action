open class User(
    val nickname: String,
    val isSubScribed: Boolean = true
)

// 何も省略しない
// class User constructor(_nickname: String) {
//     val nickname: String
//     init {
//         nickname = _nickname
//     }
// }

// 値の代入のみで初期化コードが不要な場合、かつ、
// プライマリコンストラクタに対してアノテーションや可視性修飾子がつかない場合
// class User(_nickname: String) {
//     val nickname:  = _nickname
// }

// 引数をそのまま属性値とする
// class User(val nickname: String)
