fun Advanced() {


  // ===== ===== ===== ===== =====
  // クラスの継承
  // ===== ===== ===== ===== =====

  val student: Student = Student("student A")
  val teacher: Teacher = Teacher("teacher A")

  println("student: ${student.name}")
  println("teacher: ${teacher.name}")

  student.sayHello()
  teacher.sayHello()

  student.sayGoodBye()
  teacher.sayGoodBye()


  // ===== ===== ===== ===== =====
  // オブジェクトキーワード
  // ===== ===== ===== ===== =====

  // オブジェクトキーワードは、シングルトンパターンを実現するために使われる。
  // シングルトンパターンは、インスタンスを一つしか生成しないパターン。
  // 例えば、ログ出力を行うクラスをシングルトンパターンで実装すると、
  // そのクラスのインスタンスを複数生成しても、
  // 一つのログファイルに出力される。
  // by coplit

  // 問題点として、シングルトンパターンは、テストがしにくい。
  // また、シングルトンパターンは、複数のクラスを組み合わせて、
  // 一つの機能を実現する場合に、
  // そのクラスのインスタンスを複数生成することができない。
  // 例えば、ログ出力を行うクラスと、
  // データベースに接続するクラスをシングルトンパターンで実装すると、
  // そのクラスのインスタンスを複数生成しても、
  // 一つのログファイルに出力されるが、
  // データベースに接続することができない。
  // このような場合には、シングルトンパターンではなく、
  // オブジェクトキーワードを使う。
  // by coplit

  // オブジェクトキーワードは、シングルトンパターンと同じく、
  // インスタンスを一つしか生成しない。
  // また、オブジェクトキーワードは、
  // クラスのように、メソッドやプロパティを持つことができる。
  // また、オブジェクトキーワードは、
  // クラスのように、継承することができる。
  // by coplit

  // オブジェクトキーワードはコンストラクタ引数を使用することができない。
  // by osawa

  Authenticate.authenticate("userA", "passwordA")


  // ===== ===== ===== ===== =====
  // コンパニオン
  // ===== ===== ===== ===== =====

  // コンパニオンオブジェクトは、クラスの中に定義することができる。
  // コンパニオンオブジェクトは、クラスの中でしか使用することができない。
  // by coplit

  // 静的(static)キーワード的な役割(in Java)

  var student2: Student2 = Student2("student B")
  println("student2: ${student2.name}")
  var student_object: Student = Student2.Companion.create("student C")
  println("student_object: ${student_object.name}")


  // ===== ===== ===== ===== =====
  // インターフェース
  // ===== ===== ===== ===== =====

  var courseRepo = CourseRepositoryImpl()
  var cource = courseRepo.getById(1)

  // インターフェースは、クラスのように、
  // メソッドやプロパティを持つことができる。
  // また、インターフェースは、
  // クラスのように、継承することができる。
  // by coplit

  // クラスは複数のインターフェースを継承することができる。
  // しかしながら、クラスは、一つのクラスしか継承することができない。
  // by coplit


  // ===== ===== ===== ===== =====
  // データ型
  // ===== ===== ===== ===== =====

  // データ型は「is」キーワードを使用して、確認ができる。
  // Javaでいう「instance of」に該当する。

  // データ型は「as」キーワードを使用して変換することができる。
  // Javaでいう「キャスト」に該当する。

  // データ型は「!!」キーワードを使用して、
  // nullでないことを確認することができる。
  // Javaでいう「nullチェック」に該当する。
  // by coplit

  // データ型は「?:」キーワードを使用して、
  // nullの場合に、デフォルト値を設定することができる。

  val a: Any = "Hello"
  println(a is String)
  println(a is Int)
  println(a is Double)
  println(a is Boolean)
  println(a is Float)
  println(a is Long)
  println(a is Short)
  println(a is Byte)
  println(a is Char)

  when (a) {
    is String -> println("a is String")
    is Int -> println("a is Int")
    is Double -> println("a is Double")
    is Boolean -> println("a is Boolean")
    is Float -> println("a is Float")
    is Long -> println("a is Long")
    is Short -> println("a is Short")
    is Byte -> println("a is Byte")
    is Char -> println("a is Char")
  }

  // 上記全てcoplitにより生成

}

// クラスの継承

open class User(val name: String) {
  // open修飾子で継承可能であることを示す。
  // これがないと、継承できない。

  fun sayHello() {
    println("Hello, ${this.name}")
  }

  // open修飾子をつけることで、オーバーライド可能であることを示す。
  open fun sayGoodBye() {
    println("Good bye, ${this.name}")
  }

  // メソッドだけでなく、プロパティも同様。

  open val age: Int = 0

}


class Student(name: String) : User(name) {
  // Userクラスが保有するsayGoodByeメソッドをオーバーライドする。
  override fun sayGoodBye() {
    println("Good bye, ${this.name}. See you again.")

    // superを使うことで、親クラスのメソッドを呼び出すことができる。
    // これは、オーバーライドしたメソッド内でのみ使用可能。
    super.sayGoodBye()
  }

  override val age: Int = 15
}

class Teacher(name: String) : User(name) {
  // Userクラスが保有するsayGoodByeメソッドをオーバーライドする。
  override fun sayGoodBye() {
    println("Good bye, ${this.name}. See you tomorrow.")

    // superを使うことで、親クラスのメソッドを呼び出すことができる。
    // これは、オーバーライドしたメソッド内でのみ使用可能。
    super.sayGoodBye()
  }

  override val age: Int = 30
}

// オブジェクトキーワード

object Authenticate {

  fun authenticate(userName: String, password: String) {
    println("userName: ${userName}")
    println("password: ${password}")
  }

}

// コンパニオン

class Student2(val name: String) {

  companion object {
    fun create(name: String): Student {
      println("$name created")
      return Student(name)
    }

    // コンパニオンオブジェクト内でプロパティを定義することもできる。
    // ただし、コンパニオンオブジェクト内でプロパティを定義すると、
    // クラスの外からはアクセスできない。
    // by coplit

    // valは、コンパニオンオブジェクト内でのみ使用可能。
    // by coplit

    // また、原則として定数として定義する。
    // これは、メモリの競合を防ぐためである。

    const val count: Int = 0
  }

}

// インターフェース

interface CourseRepository {
  fun getById(id: Int): Course
}

class CourseRepositoryImpl : CourseRepository {
  override fun getById(id: Int): Course {
    return Course(id, "course A", "Osawa")
  }
}


interface A {
  fun doSomething() {
    println("dosomething A")
  }
}

interface B {
  fun doSomething() {
    println("dosomething B")
  }
}

class AB : A, B {
  override fun doSomething() {
    // super<型>とすることで特定の継承もとのメンバにアクセスすることができる。

    super<A>.doSomething()
    super<B>.doSomething()
    println("dosomething AB")
  }
}


// アクセス修飾子

class AccessModifier {
  // public: どこからでもアクセス可能。
  // internal: 同一モジュール内からのみアクセス可能。
  // protected: 同一ファイル内、またはサブクラスからのみアクセス可能。
  // private: 同一ファイル内からのみアクセス可能。
  // by coplit

  public val _public: String = "public"
  internal val _internal: String = "internal"
  protected val _protected: String = "protected"
  private val _private: String = "private"
}

// データ型とwhen句
// スマートキャスト

fun checkType(type: Any) {
  when (type) {
    is Course -> {
      // typeはAny型として受け取ったのにも関わらず、
      // 強力な型推論により、Course型として扱うことができる。
      println(type.id)
      println(type.name)
      println(type.author)
    }
    is CourseRepository -> {
      // typeはAny型として受け取ったのにも関わらず、
      // 強力な型推論により、CourseRepository型として扱うことができる。
      println(type.getById(1))
    }
    is CourseRepositoryImpl -> {
      // typeはAny型として受け取ったのにも関わらず、
      // 強力な型推論により、CourseRepositoryImpl型として扱うことができる。
      println(type.getById(1))
    }
    else -> {
      println("unknown type")
    }
  }
}
