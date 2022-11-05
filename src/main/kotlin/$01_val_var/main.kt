package `$01_val_var`

// valとvarについて
// valは「value: 値」の意味で、変更不可の変数です。
// varは「variable: 変数」の意味で、変更可能な変数です。

fun main() {
  // valで変数を宣言すると、その変数は変更不可になります。
  // valは、変数を宣言するときに初期化する必要があります。

  val _val: String = "Kotlin"
  // _val = "cannot change..." // エラー
  println("Hello, $_val!")

  // ========== ========== ==========

  // varで変数を宣言すると、その変数は変更可能になります。
  // varは、変数を宣言するときに初期化する必要はありません。

  var _var: String = "Kotlin"
  _var = "can change!!!"
  println("Hello, $_var!")
}
