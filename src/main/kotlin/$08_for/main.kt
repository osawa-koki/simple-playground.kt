package `$08_for`

fun main() {
  // for文は、配列やリストなどのコレクションを繰り返し処理するための構文です。
  // 他の言語と同様に、for文は、繰り返し処理の回数を指定することができます。

  // 「range」パッケージで説明したとおりです。

  // 1から10までの数値を表示
  for (i in 1..10) {
    println("$i of 10 times (simple)")
  }

  // stepを指定することで、繰り返し処理の回数を指定することができます。

  // 1から10までの数値を2つ飛ばしで表示
  for (i in 1..10 step 2) {
    println("$i of 5 times (step)")
  }

  // downToを指定することで、逆順に繰り返し処理を行うことができます。

  // 10から1までの数値を表示
  for (i in 10 downTo 1) {
    println("$i of 10 times (reverse)")
  }

  // untilを指定することで、指定した値の直前まで繰り返し処理を行うことができます。

  // 1から9までの数値を表示
  for (i in 1 until 10) {
    println("$i of 9 times (until)")
  }
}
