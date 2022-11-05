package `$15_getter_setter`

fun main() {
  // getterとsetterを使うと、
  // プロパティの値を取得したり、
  // プロパティの値を設定したりすることができます。
  // getterとsetterは、
  // プロパティの前にgetとsetを付けることで定義できます。

  val osawa: Person = Person("Osawa")
  println("name: ${osawa.name}")

  val anonymous: Person = Person("")
  println("name: ${anonymous.name}")
}

class Person() {
  var name: String = ""
    get() {
      return field
    }
    set(value) {
      // setterを使用すると、
      // プロパティの値を設定するときに
      // 何らかの処理を行うことができます。
      // 例えば、
      // プロパティの値を設定するときに
      // その値が空文字列でないかを確認する処理を行うことができます。
      if (value != "") {
        field = value
      } else {
        println("空文字列は設定できません")
        field = "名無し"
      }
    }
  // 今回の場合には、getterを使用するため、プライマリコンストラクタではなく、
  // セカンダリコンストラクタを使用しています。
  constructor(name: String): this() {
    this.name = name
  }
}
