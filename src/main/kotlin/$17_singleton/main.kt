package `$17_singleton`

fun main() {
  // シングルトンパターンは、
  // インスタンスを1つしか生成しないようにするデザインパターンです。
  // シングルトンパターンを実現するには、
  // インスタンスを生成するコンストラクタをprivateにします。
  // そして、インスタンスを取得するためのメソッドを用意します。
  // このメソッドは、
  // インスタンスが生成されていない場合は、
  // インスタンスを生成して返すようにします。
  // インスタンスが生成されている場合は、
  // 既に生成されているインスタンスを返すようにします。
  // このように、
  // インスタンスが生成されているかどうかを判定して、
  // 必要に応じてインスタンスを生成するようにすることで、
  // シングルトンパターンを実現します。
  // Kotlinではobjectキーワードを使うことで、
  // シングルトンパターンを実現することができます。

  Authenticate.authenticate("userA", "passwordA")

  // 静的メンバのようなものです。
}

object Authenticate {
  fun authenticate(userName: String, password: String) {
    println("userName: ${userName}")
    println("password: ${password}")
  }
}
