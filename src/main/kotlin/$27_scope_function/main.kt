package `$27_scope_function`

fun main() {
  // scope functionは、オブジェクトのスコープ内で処理を行うための関数です。
  // これらの関数は、オブジェクトのスコープ内で処理を行うために、
  // オブジェクトをレシーバとして受け取ります。

  val nameNullable: String? = null
  val name: String = nameNullable ?: "default"

  nameNullable?.run {
    println("nameNullable.run -> ${this.length}")
  }

  nameNullable?.let {
    println("nameNullable.let -> ${it.length}")
  }

  nameNullable?.also {
    println("nameNullable.also -> ${it.length}")
  }

  nameNullable?.apply {
    println("nameNullable.apply -> ${this.length}")
  }

  // 上記処理はほとんど同じように動作します。
  // ref : https://kotlinlang.org/docs/scope-functions.html

  // 公式ドキュメントでは以下のように違いが説明されています。
  // ---------+------------------+-----------------+----------------------
  // Function | Object reference | Return value    | is extension function
  // ---------+------------------+-----------------+----------------------
  // run      | this             | lambda result   | yes
  // let      | it               | lambda result   | yes
  // with     | this             | lambda result   | no
  // apply    | this             | Context object  | yes
  // also     | it               | Context object  | yes
  // ---------+------------------+-----------------+----------------------
  
  // ===== ===== ===== ===== =====

  // また、下記のような複雑な処理を行うこともできます。

  nameNullable?.takeIf {
    it.length > 5
  }?.let {
    println("nameNullable.takeIf -> ${it.length}")
  }

  nameNullable?.takeUnless {
    it.length > 5
  }?.let {
    println("nameNullable.takeUnless -> ${it.length}")
  }

  // takeIfとtakeUnlessは、条件を満たす場合と満たさない場合で、
  // 処理を分けることができます。

  // takeIfは、条件を満たす場合に処理を行います。
  // takeUnlessは、条件を満たさない場合に処理を行います。
}
