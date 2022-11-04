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


  // while式
  // これは普通、、、

  var _while_i: Int = 0
  while (_while_i < 5) {
    println("${_while_i++}回目です。")
  }

  // こっちも可能。
  _while_i = 0;
  do {
    println("${_while_i++}回目です。")
  } while (_while_i < 5)


  // ラベル
  // これは結構便利かも。
  // 「continue」でも使えるよ♪

  outerloop1@ for(i in 1..5) {
    println("i -> $i")
    innerloop1@ for (j in 1..5) {
      println("j -> $j")
      if (3 <= j) break@outerloop1
    }
  }

  outerloop2@ for(i in 1..5) {
    println("i -> $i")
    innerloop2@ for (j in 1..5) {
      println("j -> $j")
      if (3 <= j) break@innerloop2
    }
  }

  // ===== ===== ===== ===== =====
  // 関数
  // ===== ===== ===== ===== =====

  // めっちゃ普通。

  println(Add(1, 2))

  // 名前付き引数として使うこともできる。
  println(Add(b = 5, a = 2))



  // ===== ===== ===== ===== =====
  // グローバルスコープ
  // ===== ===== ===== ===== =====

  println(_toplevel_val)


  // ===== ===== ===== ===== =====
  // クラス
  // ===== ===== ===== ===== =====

  var person: Person = Person("osawa", 23)
  person.action()

  val item = Item("item1", 100)
  println(item.name)
  println(item.price)

  var person2: Person2 = Person2(email = "osawa@example.com", name = "osawa")
  println("name: ${person2.name}, email: ${person2.email}, age: ${person2.age}")

  var person3: Person3 = Person3("osawa", 23)
  println("name: ${person3.name}, email: ${person3.email}, age: ${person3.age}, namelength: ${person3.namelength}")

  // プライマリコンストラクタとセカンダリコンストラクタは非常に複雑
  // 原則としてプライマリコンストラクタを採用する。
  // セカンダリコンストラクタは、プライマリコンストラクタの引数をそのまま使う場合に使う。
  // それ以外の場合は、プライマリコンストラクタを使う。
  // なお、プライマリコンストラクタは、クラスの定義の中に書く。
  // セカンダリコンストラクタは、クラスの定義の中に書く。
  // セカンダリコンストラクタは、initブロックとして書くこともできる。
  // セカンダリコンストラクタは、複数定義できる。
  // セカンダリコンストラクタは、this()を使って、プライマリコンストラクタを呼び出すことができる。



  // ===== ===== ===== ===== =====
  // データクラス
  // ===== ===== ===== ===== =====

  val course = Course(100, "Kotlin", "osawa")

  // メリットはそのまま出力した際に、きれいに(シンボル情報等がない状態で)出力されること。
  // 主にデバグ目的で。

  val course2 = Course(100, "Kotlin", "osawa")

  println("is equal??? -> ${course == course2}")

  // データクラスはオブジェクトの比較ができる。

  // 以下、僕の親友であるcoplitが自動生成。

  // ただし、プリミティブ型のみ。
  // また、データクラスのプロパティには、nullを許容しない。
  // また、データクラスのプロパティには、デフォルト値を設定できない。
  // また、データクラスのプロパティには、varを使うことができない。
  // また、データクラスのプロパティには、アノテーションを付与できない。
  // また、データクラスのプロパティには、アクセス修飾子を付与できない。
  // また、データクラスのプロパティには、オーバーライドできない。
  // また、データクラスのプロパティには、オーバーロードできない。

  // ===== ここまで =====

  // copyメソッドに関して書こうと思ったら、coplitが自動で書いてくれた。

  // データクラスには、copy()メソッドが用意されている。
  // これは、データクラスのプロパティを、一部変更した新しいインスタンスを生成する。

  // ===== ここまで =====

  // ===== ===== ===== ===== =====
  // getterとsetter
  // ===== ===== ===== ===== =====

  var item2_1: Item2 = Item2("item2", 200)
  var item2_2: Item2 = Item2("item2", -100)

  println("name: ${item2_1.name}, price: ${item2_1.price}")
  println("name: ${item2_2.name}, price: ${item2_2.price}") // priceが0になる。

  // getterとsetterは、プロパティに対して定義する。

  Advanced()

}

fun Add(a: Int, b: Int): Int {
  return a + b
}

// 第一級的な書き方も可能。
fun Add_(a: Int, b:Int): Int = a + b

// 戻り値がない場合には「Unit」
// void的な
fun return_void() {
  return
}


// デフォルト値も使える。
fun Reduce(a: Int = 5, b: Int = 2): Int {
  return a - b
}


const val _toplevel_val: String = "Hello Kotlin..."


// ===== ===== ===== ===== =====
// クラス
// ===== ===== ===== ===== =====

class Person(
  val name: String,
  val age: Int
) {
  fun action() {
    println("Iam $name and $age years old...")
  }
}

class Item() {
  var name: String = ""
  var price: Int = 0

  constructor(name: String, price: Int): this() {
    this.name = name
    this.price = price
  }
}

// 少し複雑なクラス

class Person2(
  val name: String = "mainname",
  val age: Int = 0
) {

  var email: String = ""
  constructor(name: String = "subname", email: String): this(name) {
    this.email = email
  }

  fun action() {
    println("Iam $name and $age years old...")
  }
}

class Person3(
  val name: String = "mainname",
  val age: Int = 0
) {

  var email: String = ""
  var namelength: Int = 0

  init {
    namelength = name.length
  }
  constructor(name: String = "subname", email: String): this(name) {
    this.email = email
  }

  fun action() {
    println("Iam $name and $age years old...")
  }
}

// データクラス

data class Course(
  val id: Int,
  val name: String,
  val author: String
)


// setterとgetter

class Item2() {
  var name: String = ""
    get() {
      return field
    }
    set(value) {
      field = value
    }
  var price: Int = 0
    get() {
      println("getter called")
      return field
    }
    set(value) {
      println("setter called")
      if (value < 0) {
        field = 0
      } else {
        field = value
      }
    }

  constructor(name: String, price: Int): this() {
    this.name = name
    this.price = price
  }
}
