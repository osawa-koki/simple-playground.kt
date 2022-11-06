package `$23_operation_on_collection`

fun main() {
  // コレクションに対する操作を学習します。
  // コレクションに対する操作のうち、要素の追加、削除、変更、検索、ソート、絞り込み、集計についてはすでに学習済みです。

  // リストのループ

  // リストの要素を順番に取り出して処理を行うには、forEachを使用します。
  // forEachは、リストの要素を順番に取り出して、引数に指定した処理を行います。
  // 以下の例では、リストの要素を順番に取り出して、それぞれの要素を出力しています。
  val numList = listOf<Int>(1, 2, 3, 4, 5)
  numList.forEach {
    println("numList.map: ${it}")
  }

  // インデックス番号も欲しい場合には、forEachIndexedを使用します。
  // forEachIndexedは、リストの要素を順番に取り出して、引数に指定した処理を行います。
  // 以下の例では、リストの要素を順番に取り出して、それぞれの要素とインデックスを出力しています。
  numList.forEachIndexed { index, num ->
    println("numList.forEachIndexed: ${index} -> ${num}")
  }

  // 通常のfor文を使用しても、リストの要素を順番に取り出して処理を行うことはできます。
  // 以下の例では、リストの要素を順番に取り出して、それぞれの要素を出力しています。
  for (num in numList) {
    println("numList.map: ${num}")
  }

  // マップのループ

  // マップの要素を順番に取り出して処理を行うには、forEachを使用します。
  // forEachは、マップの要素を順番に取り出して、引数に指定した処理を行います。
  // 以下の例では、マップの要素を順番に取り出して、それぞれの要素を出力しています。
  val numMap = mapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
  numMap.forEach {
    println("numMap.forEach: ${it.key} -> ${it.value}")
  }

  // 通常のfor文を使用しても、マップの要素を順番に取り出して処理を行うことはできます。
  // 以下の例では、マップの要素を順番に取り出して、それぞれの要素を出力しています。
  for ((key, value) in numMap) {
    println("numMap.forEach: ${key} -> ${value}")
  }

  // セットのループ

  // セットの要素を順番に取り出して処理を行うには、forEachを使用します。
  // forEachは、セットの要素を順番に取り出して、引数に指定した処理を行います。
  // 以下の例では、セットの要素を順番に取り出して、それぞれの要素を出力しています。
  val numSet = setOf<Int>(1, 2, 3, 4, 5)
  numSet.forEach {
    println("numSet.forEach: ${it}")
  }

  // 通常のfor文を使用しても、セットの要素を順番に取り出して処理を行うことはできます。
  // 以下の例では、セットの要素を順番に取り出して、それぞれの要素を出力しています。
  for (num in numSet) {
    println("numSet.forEach: ${num}")
  }

}

