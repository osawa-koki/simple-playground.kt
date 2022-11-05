
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




}
