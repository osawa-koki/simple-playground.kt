package `$16_inheritance`

fun main() {
  val osawa: Person = Person("Osawa", 23)
  println("name: ${osawa.name}, age: ${osawa.age}")

  val osawa_at_school: Student = Student("Osawa", 23, 3)
  println("name: ${osawa_at_school.name}, age: ${osawa_at_school.age}, grade: ${osawa_at_school.grade}")

  val osawa_at_work: Employee = Employee("Osawa", 23, "Engineer")
  println("name: ${osawa_at_work.name}, age: ${osawa_at_work.age}, job: ${osawa_at_work.job}")

  // SOLID原則の「L」、「Liskov Substitution Principle」
  // 「継承は、派生クラスのインスタンスを、基底クラスのインスタンスとして扱えるようにする」
  // という原則に基づいて、
  // Personクラスを基底クラスとして、
  // StudentクラスとEmployeeクラスを派生クラスとして、
  // それぞれのクラスのインスタンスを、
  // Personクラスのインスタンスとして扱うことができます。

  val osawa_at_school_as_person: Person = Student("Osawa", 23, 3)
  println("name: ${osawa_at_school_as_person.name}, age: ${osawa_at_school_as_person.age}")

  val osawa_at_work_as_person: Person = Employee("Osawa", 23, "Engineer")
  println("name: ${osawa_at_work_as_person.name}, age: ${osawa_at_work_as_person.age}")
}

// クラスの継承は、ほかの言語と同じです。
// クラスを継承させるには、open修飾子をつける必要があります。
// クラスの継承を行うと、
// 継承元のクラスのメンバーを継承先のクラスで使用することができます。
// また、継承先のクラスでメンバーをオーバーライドすることもできます。
// オーバーライドすると、
// 継承元のクラスのメンバーを継承先のクラスで上書きすることができます。
// また、継承先のクラスでメンバーをオーバーライドすることもできます。
// オーバーライドすると、
// 継承元のクラスのメンバーを継承先のクラスで上書きすることができます。

open class Person() {
  var name: String = ""
  var age: Int = 0
  constructor(name: String, age: Int): this() {
    this.name = name
    this.age = age
  }
}

// 継承元のクラスのメンバーを継承先のクラスで使用することができます。
class Student: Person {
  var grade: Int = 0
  constructor(name: String, age: Int, grade: Int): super(name, age) {
    this.grade = grade
  }
}

// 継承元のクラスのメンバーを継承先のクラスで上書きすることができます。
class Employee: Person {
  var job: String = ""
  constructor(name: String, age: Int, job: String): super(name, age) {
    this.job = job
  }
}
