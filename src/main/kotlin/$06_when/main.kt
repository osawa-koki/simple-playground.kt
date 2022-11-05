package `$06_when`

fun main() {
  // switchは、Kotlinではwhenで実現されます。

  // whenは、以下のように書きます。

  // when (変数) {
  //   条件式1 -> {
  //     条件式1がtrueの場合の処理
  //   }
  //   条件式2 -> {
  //     条件式2がtrueの場合の処理
  //   }
  //   else -> {
  //     どの条件式もtrueにならなかった場合の処理
  //   }
  // }

  val _int: Int = 1
  when (_int) {
    1 -> {
      println("int is 1")
    }
    2 -> {
      println("int is 2")
    }
    else -> {
      println("int is not 1 or 2")
    }
  }
}
