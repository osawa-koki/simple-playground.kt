package `$25_lazy_evaluation`

fun main() {
  // Lazy Evaluation (遅延評価)
  // 遅延評価は、値を必要とするまで評価を遅らせることです。
  // 遅延評価を行うには、lazy関数を使用します。

  val lazyValue: Int by lazy {
    println("computed!")
    10
  }

  println("lazyValue: $lazyValue")

  // このように、lazy関数を使用すると、値を必要とするまで評価を遅らせることができます。

  // また、lazy関数は、スレッドセーフです。
  // つまり、複数のスレッドから同時にアクセスしても、
  // 1度しか評価されないことが保証されています。

  // このように、遅延評価を行うことで、
  // 不要な計算を行わないようにすることができます。

  // ===== ===== ===== ===== =====

  // Sequence (シーケンス)

  // シーケンスは、
  // 要素を順番に生成することができるコレクションです。

  // シーケンスの説明をする前に、シーケンスを使用しない場合の例を見てみましょう。

  // 1から100までの整数のリストを作成します。
  val list = (1..100).toList()

  // このリストから、
  // 3の倍数の要素だけを取り出して、
  // それらの要素を2乗したリストを作成します。

  val namesList_1 = listOf<String>("alex", "ben", "charlie")
    .filter { 4 <= it.length } // [alex, charlie]
    .map { it.toUpperCase() } // [ALEX, CHARLIE]

  println("namesList_1: $namesList_1")

  // 実行結果
  // namesList_1: [ALEX, CHARLIE]

  // ===== ===== ===== ===== =====

  // sequence関数を使用すると、
  // コレクションの要素をひとつずつ処理することができます。
  // シーケンスを使用する場合には、以下のように書きます。

  val namesList_2 = listOf<String>("alex", "ben", "charlie")
    .asSequence()
    .filter { 4 <= it.length }
    .map { it.toUpperCase() }
    .toList()

  println("namesList_2: $namesList_2")

  // 実行結果
  // namesList_2: [ALEX, CHARLIE]

  // 実行結果は同じですが、
  // 大量のデータを処理する際には、シーケンスを使用したほうが、
  // 効率的な処理を実現できます。
  //   -> 途中のコレクションを生成しない
}
