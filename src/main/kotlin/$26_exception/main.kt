package `$26_exception`

fun main() {
  // Kotlinでの例外処理はJavaと同じようにtry-catch-finallyを使います。
  // 例外処理はtryブロック内で発生した例外をcatchブロックでキャッチします。
  // 例外が発生しなかった場合はcatchブロックは実行されません。

  // Javaとの相違点として、checked exceptionがないことがあげられます。

  try {
    val name: String? = null
    println("name length -> ${name!!.length}")
  } catch (ex: Exception) {
    println("error -> ${ex.message}")
  } finally {
    println("finally")
  }

  // また、tryブロック内で発生した例外をcatchブロックでキャッチした場合は、
  // その例外をthrowすることができます。

//  try {
//    val name: String? = null
//    println("name length -> ${name!!.length}")
//  } catch (ex: Exception) {
//    println("error -> ${ex.message}")
//    throw ex
//  } finally {
//    println("finally")
//  }

  // 例外をthrowすることで、呼び出し元に例外を伝播させることができます。

  // ===== ===== ===== ===== =====

  // try catch句は式として利用することができます。

  val result = try {
    val name: String? = null
    println("name length -> ${name!!.length}")
  } catch (ex: Exception) {
    println("error -> ${ex.message}")
    0
  } finally {
    println("finally")
  }

  println("result -> $result")
}
