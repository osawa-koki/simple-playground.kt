package `$12_global_scope`

fun main() {
  // グローバルスコープ
  // 「main.kt」ファイルで定義したグローバルスコープに属する変数と関数を呼び出します。
  // 「main.kt」という名前でありながら、main関数を有しておらず、
  // 「caller.kt」ファイルがmain関数を持っているという、
  // 少し変な構成は無視してください。

  println(globalVal)
  println(globalFunc())
}
