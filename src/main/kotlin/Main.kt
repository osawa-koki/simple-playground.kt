fun main(args: Array<String>) {
  println("Hello World!")

  // Try adding program arguments via Run/Debug configuration.
  // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
  println("Program arguments: ${args.joinToString()}")

  // ===== ===== ===== ===== =====
  // ミュータブルとイミュータブル
  // ===== ===== ===== ===== =====

  // 「val」はイミュータブル
  val a: Int = 1
  // a = 2

  // 「var」はミュータブル
  var b: Int = 1
  b = 2

  // ===== ===== ===== ===== =====
  // データ型
  // ===== ===== ===== ===== =====

  val _int: Int = 10
  val _byte: Byte = 100
  val _short: Short = 1000
  val _long: Long = 10000L

  val _float: Float = 10.0F
  val _double: Double = 10.0

  val _char: Char = 'A'
  val _string: String = "$_char | ${_byte.toString()}"
  val _str_multi: String = """
    M
    u
    l
    t
    i

    W
    i
    r
    d
  """.trimIndent()

}
