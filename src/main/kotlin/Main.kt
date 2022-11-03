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

  // ===== ===== ===== ===== =====
  // 処理の制御
  // ===== ===== ===== ===== =====

  // if文

  if (1 + 1 == 2) {
    println("CORRECT!!!")
  } else {
    println("WRONG...")
  }

  // if文が式だからこんなこともできる。
  val _if_val: String = if (1 + 1 == 2) {
    println("yeah!!")
    "CORRECT"
  } else {
    println("oh my zsh...")
    "WRONG"
  }

  // when文

  when (1) {
    1 -> {
      println("1です。")
    }

    2 -> {
      println("2です、、、")
    }

    3 -> {
      println("3かも???")
    }

    else -> {
      println("う～～～ん、、、")
    }
  }

  // whenも式だよ♪
  val _when_val: String = when (1) {
    1 -> {
      println("1です。")
      "No. 1"
    }

    2 -> {
      println("2です、、、")
      "-2-"
    }

    3 -> {
      println("3かも???")
      "THREE"
    }

    else -> {
      println("う～～～ん、、、")
      "???"
    }
  }

  // もっと簡単に♪

  val _when_val_shorthand: String = when (1) {
    1 -> "No. 1"
    2 -> "-2-"
    3 -> "THREE"
    else -> "???"
  }


  // ===== ===== ===== ===== =====
  // 範囲系
  // ===== ===== ===== ===== =====

  val _range_int: IntRange = 1..10
  for (i in _range_int) {
    println(i)
  }
  for (i in _range_int step 2) {
    println(i)
  }

  
}
