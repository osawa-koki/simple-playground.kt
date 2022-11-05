package `$02_datatype`

fun main() {
  // ===== ===== ===== ===== =====
  // データ型
  // ===== ===== ===== ===== =====

  // Kotlinのデータ型は、Javaのデータ型とほぼ同じです。

  // Kotlinのデータ型は、以下のようになっています。
  // - Byte
  // - Short
  // - Int
  // - Long
  // - Float
  // - Double
  // - Char
  // - String
  // - Boolean
  // - Array
  // - List
  // - Set
  // - Map
  // - Any
  // - Nothing
  // - Unit

  val _byte: Byte = 1
  val _short: Short = 1
  val _int: Int = 1
  val _long: Long = 1
  val _float: Float = 1.0f
  val _double: Double = 1.0
  val _char: Char = 'a'
  val _string: String = "a"
  val _boolean: Boolean = true
  val _array: Array<Int> = arrayOf(1, 2, 3)
  val _list: List<Int> = listOf(1, 2, 3)
  val _set: Set<Int> = setOf(1, 2, 3)
  val _map: Map<String, Int> = mapOf("a" to 1, "b" to 2, "c" to 3)
  val _any: Any = 1
  // val _nothing: Nothing = throw Exception() // エラーを発生させるため、コメントアウトしています。
  val _unit: Unit = Unit

  println(_byte)
  println(_short)
  println(_int)
  println(_long)
  println(_float)
  println(_double)
  println(_char)
  println(_string)
  println(_boolean)
  println(_array)
  println(_list)
  println(_set)
  println(_map)
  println(_any)
  // println(_nothing)
  println(_unit)
}
