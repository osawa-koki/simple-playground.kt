package companion

fun main() {
  // コンパニオンとは簡単に説明すると、クラス内に作成されるシングルトンです。
  // コンパニオンオブジェクトは、
  // クラス名と同じ名前のオブジェクトとして扱われます。
  // コンパニオンオブジェクトは、
  // クラスの外からはアクセスできません。
  // また、コンパニオンオブジェクト内で定義されたメソッドやプロパティは、
  // クラスの外からはアクセスできません。
  // ただし、コンパニオンオブジェクト内で定義されたメソッドやプロパティは、
  // クラスの内部からはアクセスできます。
  // コンパニオンオブジェクトは、
  // クラスの内部からはアクセスできます。
  // Javaでいうところのstaticメンバのようなものです。

  // Companionキーワードは省略することができます。
  Authenticate.Companion.authenticate("userA", "passwordA")
  Authenticate.authenticate("userA", "passwordA")
}

class Authenticate() {

  companion object {
    fun authenticate(userName: String, password: String) {
      println("userName: ${userName}")
      println("password: ${password}")
    }
  }
}
