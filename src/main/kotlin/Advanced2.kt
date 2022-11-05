
fun CollectionStudy() {

  // ===== ===== ===== ===== =====
  // コレクション
  // ===== ===== ===== ===== =====

  // イミュータブル
  val names = listOf<String>("Alex", "Ben", "Chloe")
  println("names: ${names}")

  // ミュータブル
  val mut_names = mutableListOf<String>("Alex", "Ben", "Chloe")
  mut_names[0] = "Alex2"
  mut_names.add("Diana")
  println("mut_names: ${mut_names}")


  val set = setOf<String>("Alex", "Ben", "Chloe")
  println("set: ${set}")

  val mut_set = mutableSetOf<String>("Alex", "Ben", "Chloe")
  mut_set.add("Diana")
  println("mut_set: ${mut_set}")

  val map = mapOf<String, Int>("Alex" to 1, "Ben" to 2, "Chloe" to 3)
  println("map: ${map}")

  val mut_map = mutableMapOf<String, Int>("Alex" to 1, "Ben" to 2, "Chloe" to 3)
  mut_map["Diana"] = 4
  println("mut_map: ${mut_map}")

  // by coplit

  // ===== ===== ===== ===== =====
  // ラムダ
  // ===== ===== ===== ===== =====

  val addLambda: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
  println("addLambda: ${addLambda(1, 2)}")

  // これは普通、、、
  // 他の言語とほとんど同じ。


  // ===== ===== ===== ===== =====
  // 高階関数
  // ===== ===== ===== ===== =====

  // 関数を引数に取る関数
  fun higherOrderFunc1(x: Int, y: Int, f: (Int, Int) -> Int): Int {
    return f(x, y)
  }
  println("higherOrderFunc1: ${higherOrderFunc1(1, 2, addLambda)}")

  // 一応引き算もやってみる。
  val subLambda: (Int, Int) -> Int = { x: Int, y: Int -> x - y }
  println("higherOrderFunc1: ${higherOrderFunc1(1, 2, subLambda)}")

  // 今度は掛け算
  val mulLambda: (Int, Int) -> Int = { x: Int, y: Int -> x * y }
  println("higherOrderFunc1: ${higherOrderFunc1(1, 2, mulLambda)}")

  // そして割り算
  val divLambda: (Int, Int) -> Int = { x: Int, y: Int -> x / y }
  println("higherOrderFunc1: ${higherOrderFunc1(1, 2, divLambda)}")

  


}
