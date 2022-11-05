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


  // もっと簡単に♪
  when (_int) {
    1 -> println("int is 1")
    2 -> println("int is 2")
    else -> println("int is not 1 or 2")
  }

  // ========== ========== ==========

  // whenもifと同じように、式として使うことができます。
  // 以下のように書きます。

  // val 変数: 戻り値の型 = when (変数) {
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

  val _int2: Int = when (_int) {
    1 -> {
      1
    }
    2 -> {
      2
    }
    else -> {
      0
    }
  }
  println("_int2: $_int2")

  // もっと簡単に♪
  val _int3: Int = when (_int) {
    1 -> 1
    2 -> 2
    else -> 0
  }
  println("_int3: $_int3")

  // ifと同様に、最後の式が戻り値になります。

  val _int4: Int = when (_int) {
    1 -> {
      999
      999
      999
      1
    }
    2 -> {
      999
      999
      2
    }
    else -> {
      999
      999
      0
    }
  }
  println("_int4: $_int4")
}
