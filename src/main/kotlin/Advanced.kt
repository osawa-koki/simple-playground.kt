
fun Advanced() {

  val student: Student = Student("student A")
  val teacher: Teacher = Teacher("teacher A")

  println("student: ${student.name}")
  println("teacher: ${teacher.name}")

  student.sayHello()
  teacher.sayHello()

  student.sayGoodBye()
  teacher.sayGoodBye()

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
