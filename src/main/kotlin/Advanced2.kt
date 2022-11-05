
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


  // ===== ===== ===== ===== =====
  // コレクション操作
  // ===== ===== ===== ===== =====


  val numList = listOf<Int>(1, 2, 3, 4, 5)
  val numList_under_3 = numList.filter { it < 3 }
  println("numList_under_3: ${numList_under_3}")

  val numList_under_3_times_2 = numList_under_3.map { it * 2 }
  println("numList_under_3_times_2: ${numList_under_3_times_2}")

  val numList_under_3_times_2_sum = numList_under_3_times_2.sum()
  println("numList_under_3_times_2_sum: ${numList_under_3_times_2_sum}")

  val numList_under_3_times_2_sum_div_2 = numList_under_3_times_2_sum / 2
  println("numList_under_3_times_2_sum_div_2: ${numList_under_3_times_2_sum_div_2}")

  // by coplit

  numList.forEach {
    println("numList.map: ${it}")
  }

  // フラットマップ

  val flat_map = listOf(listOf(1, 2, 3), listOf(4, 5, 6))
  println("flat_map: ${flat_map}")

  val flat_map_flat = flat_map.flatten()
  println("flat_map_flat: ${flat_map_flat}")

  // by coplit




}
