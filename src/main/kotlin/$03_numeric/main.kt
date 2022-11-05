package `$03_numeric`

fun main() {
  // ===== ===== ===== ===== =====
  // 数値
  // ===== ===== ===== ===== =====

  // Kotlinの数値は、Javaの数値とほぼ同じです。

  // Kotlinの数値は、以下のようになっています。
  // - Byte
  // - Short
  // - Int
  // - Long
  // - Float
  // - Double

  val _byte: Byte = 1
  val _short: Short = 1
  val _int: Int = 1
  val _long: Long = 1
  val _float: Float = 1.0f
  val _double: Double = 1.0

  println(_byte)
  println(_short)
  println(_int)
  println(_long)
  println(_float)
  println(_double)

  // ========== ========== ==========

  println(1 + 1)
  println(1 - 1)
  println(1 * 1)
  println(1 / 1)
  println(1 % 1)

  // ========== ========== ==========

  println(1 == 1)
  println(1 != 1)
  println(1 > 1)
  println(1 < 1)
  println(1 >= 1)
  println(1 <= 1)

  // ========== ========== ==========

  val _int2: Int = 1
  val _long2: Long = _int2.toLong()
  val _float2: Float = _int2.toFloat()
  val _double2: Double = _int2.toDouble()

  println(_int2)
  println(_long2)
  println(_float2)
  println(_double2)

  // ========== ========== ==========

  val _int3: Int = 1
  val _long3: Long = _int3.toLong()
  val _float3: Float = _int3.toFloat()
  val _double3: Double = _int3.toDouble()

  println(_int3)
  println(_long3)
  println(_float3)
  println(_double3)
}
