
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


class Student(name: String): User(name) {
  // Userクラスが保有するsayGoodByeメソッドをオーバーライドする。
  override fun sayGoodBye() {
    println("Good bye, ${this.name}. See you again.")

    // superを使うことで、親クラスのメソッドを呼び出すことができる。
    // これは、オーバーライドしたメソッド内でのみ使用可能。
    super.sayGoodBye()
  }

  override val age: Int = 15
}

class Teacher(name: String): User(name) {
  // Userクラスが保有するsayGoodByeメソッドをオーバーライドする。
  override fun sayGoodBye() {
    println("Good bye, ${this.name}. See you tomorrow.")

    // superを使うことで、親クラスのメソッドを呼び出すことができる。
    // これは、オーバーライドしたメソッド内でのみ使用可能。
    super.sayGoodBye()
  }

  override val age: Int = 30
}
