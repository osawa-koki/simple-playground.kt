package `$04_string`

fun main() {
  // ===== ===== ===== ===== =====
  // 文字列
  // ===== ===== ===== ===== =====

  val _string: String = "Hello World!"
  println(_string)

  // ========== ========== ==========

  // 複数行からなる文字列は、"""で囲みます。
  val _string_multi_trim: String = """
    Hello
    World!
  """.trimIndent()

  println(_string_multi_trim)

  // trimIndent()は、先頭の空白を削除するメソッドです。
  // このメソッドを使わないと、以下のようになります。

  val _string_multi: String = """
    Hello
    World!
  """

  println(_string_multi)

  // ========== ========== ==========

  // 文字列の中に変数を埋め込むには、$を使います。
  // また、変数の型がStringでない場合は、toString()を使う必要があります。
  // ${}を使うと、式を埋め込むこともできます。

  val _char: String = "World"
  val _string_template: String = "Hello $_char !!! | length -> (${_char.length}) chars."
  println(_string_template)
}

