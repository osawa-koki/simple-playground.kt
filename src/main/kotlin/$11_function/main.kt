package `$11_function`

fun main() {
  // 関数の定義
  //
  // 関数は、
  // 「処理をまとめて名前をつけたもの」です。
  //
  // 関数の定義は、
  // 「fun」キーワードを使います。
  //
  // fun 関数名(引数名: 引数の型, 引数名: 引数の型, ...) {
  //   処理
  // }
  //
  // 引数は、
  // 「関数に渡す値」です。

  // Kotlinでは、関数内で関数を定義することができます。
  //
  // このように、関数内で関数を定義することを
  // 「ネストした関数」と呼びます。
  //
  // ネストした関数は、
  // 外側の関数の中でしか呼び出すことができません。

  // ネストした関数を定義します。
  // main関数内で定義されているので、
  // main関数の中でしか呼び出すことができません。
  fun add(a: Int, b: Int): Int {
    return a + b
  }

  // ネストした関数を呼び出します。
  println(add(1, 2))

  // もっと深い階層にネストした関数を定義します。
  fun add2(a: Int, b: Int): Int {
    fun add3(a: Int, b: Int): Int {
      fun add4(a: Int, b: Int): Int {
        fun add5(a: Int, b: Int): Int {
          return a + b
        }
        return add5(a, b)
      }
      return add4(a, b)
    }
    return add3(a, b)
  }

  println("deep nested: add2(1, 2) = ${add2(1, 2)}")

  // ================================

  // 戻り値がない場合は、Unit型を指定します。
  fun printHello(): Unit {
    println("Hello")
  }

  // 戻り値がない場合は、Unit型を省略することができます。
  fun printHello_() {
    println("Hello")
  }
}
