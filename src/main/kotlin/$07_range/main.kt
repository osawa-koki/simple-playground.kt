package `$07_range`

fun main() {
  // Kotlinでは「..」を使って、範囲を表現することができます。
  // これは、IntRange型のオブジェクトを生成します。

  val _range_int: IntRange = 1..10
  println("_range_int: $_range_int")

  // 範囲の中に値が含まれているかどうかを調べるには、in演算子を使います。

  println("1 in _range_int: ${1 in _range_int}")
  println("11 in _range_int: ${999 in _range_int}")

  // 範囲の中に値が含まれていないかどうかを調べるには、!in演算子を使います。

  println("1 !in _range_int: ${1 !in _range_int}")
  println("11 !in _range_int: ${999 !in _range_int}")

  // 範囲の中に値が含まれているかどうかを調べるには、contains()メソッドを使います。

  println("_range_int.contains(1): ${_range_int.contains(1)}")
  println("_range_int.contains(11): ${_range_int.contains(999)}")

  // 範囲の中に値が含まれていないかどうかを調べるには、contains()メソッドを使います。

  println("!_range_int.contains(1): ${!_range_int.contains(1)}")
  println("!_range_int.contains(11): ${!_range_int.contains(999)}")

  // 範囲オブジェクトをfor文で回すことができます。

  for (i in _range_int) {
    println("i (simple for): $i")
  }

  // stepを使うと、指定した数だけ飛ばして回すことができます。

  for (i in _range_int step 2) {
    println("i (with step): $i")
  }

  // reversedを使うと、逆順に回すことができます。

  for (i in _range_int.reversed()) {
    println("i (reversed): $i")
  }

  // downToを使うと、指定した値までの範囲を表現することができます。

  for (i in 10 downTo 1) {
    println("i (downTo): $i")
  }

  // untilを使うと、指定した値よりも1小さい値までの範囲を表現することができます。

  for (i in 1 until 10) {
    println("i (until): $i")
  }
}
