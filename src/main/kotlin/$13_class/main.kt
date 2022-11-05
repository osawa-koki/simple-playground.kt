package `$13_class`

fun main() {
  // Kotlinはオブジェクト指向もサポートしています。
  // 他の言語と同様に、クラスを定義することができます。

  // Personクラスのインスタンスを生成。
  val person = Person("John", 20)
  person.action()


  // ===== ===== ===== ===== =====

  // コンストラクタの引数にデフォルト値を設定することができます。
  // その場合、引数を省略することができます。

  val item: Item = Item()
  println("item -> name: ${item.name}, price: ${item.price}")
  println("item -> name: ${item.name}, price: ${item.price}")

  // また、引数名を指定することで、引数の順番を変えることができます。

  val osawa: Person = Person(name = "osawa", age = 23)
  val usukura: Person = Person(age = 23, name = "usukura")

  // 複雑な実装として、プライマリコンストラクタとセカンダリコンストラクタがあります。
  // プライマリコンストラクタとセカンダリコンストラクタは非常に複雑です。
  // 原則としてプライマリコンストラクタを採用します。
  // セカンダリコンストラクタは、プライマリコンストラクタの引数をそのまま使う場合に使います。
  // それ以外の場合は、プライマリコンストラクタを使います。
  // プライマリコンストラクタは、クラスの定義の中に書きます。
  // セカンダリコンストラクタは、クラスの定義の中に書きます。
  // セカンダリコンストラクタは、initブロックとして書くこともできます。
  // セカンダリコンストラクタは、複数定義できます。
  // セカンダリコンストラクタは、this()を使って、プライマリコンストラクタを呼び出すことができます。
  // initブロックは、プライマリコンストラクタの処理の後に実行されます。
  // initブロックは、複数定義できます。

  val crow: Bird = Bird("crow", 7, 10.5, 20.5)
  println("crow -> name: ${crow.name}, age: ${crow.age}, weight: ${crow.weight}, height: ${crow.height}, namelength: ${crow.namelength}")

  val sparrow: Bird = Bird("sparrow", 3, 5.5, 10.5)
  println("sparrow -> name: ${sparrow.name}, age: ${sparrow.age}, weight: ${sparrow.weight}, height: ${sparrow.height}, namelength: ${sparrow.namelength}")
}

// Personクラスを定義します。
class Person(
  val name: String,
  val age: Int
) {
  fun action() {
    println("Iam $name and $age years old...")
  }
}

// Itemクラスを定義します。
class Item() {
  var name: String = "Apple"
  var price: Int = 300

  constructor(name: String, price: Int): this() {
    this.name = name
    this.price = price
  }
}

// Birdクラスを定義します。
class Bird(
  // プライマリコンストラクタの引数に、val・varをつけると、
  // プロパティとして定義されます。
  val name: String,
  var age: Int,
  var weight: Double,
  var height: Double
) {
  // 各フィールドに対するgetter・setterを自動生成します。
  var namelength: Int = 0

  // initブロックは、プライマリコンストラクタの処理の後に実行されます。
  init {
    namelength = name.length
  }

  // セカンダリコンストラクタを定義します。
  constructor(name: String = "subname", age: Int): this(name, 10, 15.0, 20.0) {
    this.age = age
  }
}
