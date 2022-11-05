package `$20_datatype_object`

fun main() {
  // データ型はオブジェクトです。
  // したがって、データに対してどのクラスから生成されたオブジェクトかを判定することができます。
  // これは、is演算子を使うことで行うことができます。

  val str = "Hello"
  val num = 123
  val bool = true
  val list = listOf(1, 2, 3)
  val map = mapOf("a" to 1, "b" to 2, "c" to 3)
  val set = setOf(1, 2, 3)

  println("str is String: ${str is String}")
  println("num is Int: ${num is Int}")
  println("bool is Boolean: ${bool is Boolean}")
  println("list is List: ${list is List}")
  println("map is Map: ${map is Map}")
  println("set is Set: ${set is Set}")

  // 当然ですが、自作したオブジェクト(クラス)に対しても有効です。
  val student = Student("John", 20)
  println("student is Student: ${student is Student}")

  // また、is演算子は、継承関係にあるクラスに対しても有効です。
  val person = Person("John", 20)
  println("student is Person: ${student is Person}")
  println("person is Student: ${person is Student}")
  println("person is Person: ${person is Person}")

  // さらに、is演算子は、インターフェースに対しても有効です。
  val course = Course(1, "Math")
  println("course is Course: ${course is Course}")
  println("course is CourseRepository: ${course is CourseRepository}")

}

open class Person(val name: String, val age: Int) {
  fun sayHello() {
    println("Hello, ${this.name}")
  }
}

class Student(name: String, age: Int) : Person(name, age) {
  fun sayGoodBye() {
    println("Good bye, ${this.name}")
  }
}

interface CourseRepository {
  fun getCourse(id: Int): Course
}

class Course(val id: Int, val name: String) : CourseRepository {
  override fun getCourse(id: Int): Course {
    return Course(id, "Math")
  }
}
