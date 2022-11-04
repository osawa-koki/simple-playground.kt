
fun Advanced() {

  val student: Student = Student("student A")
  val teacher: Teacher = Teacher("teacher A")

  println("student: ${student.name}")
  println("teacher: ${teacher.name}")

  student.sayHello()
  teacher.sayHello()

}

// クラスの継承

open class User(val name: String) {
  // open修飾子で継承可能であることを示す。
  // これがないと、継承できない。

  fun sayHello() {
    println("Hello, ${this.name}")
  }
}


class Student(name: String): User(name) {

}

class Teacher(name: String): User(name) {

}
