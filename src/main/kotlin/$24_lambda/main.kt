package `$24_lambda`

fun main() {
  // ラムダ式は、無名の関数のことを言い、主に関数型言語で使用される技術です。
  // 以下のように、ラムダ式を変数に代入することができます。

  val sum = { x: Int, y: Int -> x + y }
  println("sum: ${sum(1, 2)}")

  // このように、ラムダ式を変数に代入することで、関数を変数として扱うことができます。
  // 関数を変数として扱うことを「関数型プログラミング」と呼びます。

  // また、ラムダ式は、関数の引数として渡すことができます。
  // 以下のように、関数の引数としてラムダ式を渡すことができます。

  fun higherOrderFunc(x: Int, y: Int, f: (Int, Int) -> Int): Int {
    return f(x, y)
  }

  println("higherOrderFunc: ${higherOrderFunc(1, 2, sum)}")

  // では、今度は、ラムダ式を引数に取る関数を定義してみましょう。
  fun calc(x: Int, y: Int, f: (Int, Int) -> Int): Int {
    return f(x, y)
  }

  // この関数を使って、引数にラムダ式を渡してみましょう。
  println("add calc: ${calc(1, 2, { x: Int, y: Int -> x + y })}")
  println("sub calc: ${calc(1, 2, { x: Int, y: Int -> x - y })}")
  println("mul calc: ${calc(1, 2, { x: Int, y: Int -> x * y })}")
  println("div calc: ${calc(1, 2, { x: Int, y: Int -> x / y })}")

  // ここでは、引数に直接ラムダ式を書いていますが、別に定義した変数を渡すこともできます。

  val add = { x: Int, y: Int -> x + y }
  val sub = { x: Int, y: Int -> x - y }
  val mul = { x: Int, y: Int -> x * y }
  val div = { x: Int, y: Int -> x / y }

  println("add calc: ${calc(1, 2, add)}")
  println("sub calc: ${calc(1, 2, sub)}")
  println("mul calc: ${calc(1, 2, mul)}")
  println("div calc: ${calc(1, 2, div)}")

  // また、関数の戻り値にラムダ式を使うこともできます。
  // 以下のように、関数の戻り値にラムダ式を使うことができます。

  fun returnFunc(): (Int, Int) -> Int {
    return { x: Int, y: Int -> x + y }
  }

  println("returnFunc: ${returnFunc()(1, 2)}")

  // 上の例では「returnFunc()」の実行結果がラムダ式になっています。
  // したがって、これをさらに「()」で実行することで、ラムダ式の実行結果を得ることができます。

  // では、下記の引数に応じて、ラムダ式を返す関数を定義してみましょう。
  // 1 -> 足し算
  // 2 -> 引き算
  // 3 -> 掛け算
  // 4 -> 割り算
  // その他 -> 0

  fun returnOperation(a: Int): (Int, Int) -> Int {
    return when (a) {
      1 -> {{ x: Int, y: Int -> x + y }}
      2 -> {{ x: Int, y: Int -> x - y }}
      3 -> {{ x: Int, y: Int -> x * y }}
      4 -> {{ x: Int, y: Int -> x / y }}
      else -> {{ x: Int, y: Int -> 0 }}
    }
  }

  // この関数を使って、ラムダ式を実行してみましょう。
  println("returnOperation (1: add): ${returnOperation(1)(1, 2)}")
  println("returnOperation (2: sub): ${returnOperation(2)(1, 2)}")
  println("returnOperation (3: mul): ${returnOperation(3)(1, 2)}")
  println("returnOperation (4: div): ${returnOperation(4)(1, 2)}")
  println("returnOperation (5: 0): ${returnOperation(5)(1, 2)}")

}

