package `$10_label`

fun main() {
  // 「while」で説明した内容の復習です。

  // ラベルを付けることで、
  // break文やcontinue文の対象を、
  // ラベルが付いたループに限定することができます。

  outerloop@ for (i in 1..5) {
    println("i = $i")
    innerloop@ for (j in 1..5) {
      println("j = $j")
      if (j == 3) break@outerloop
    }
  }

  // また、ラベルを付けることで、
  // ループの外側にある変数を、
  // ループの中で変更することができます。

  var k = 0
  outerloop@ while (k < 10) {
    println("k = $k")
    k++
    innerloop@ while (k < 10) {
      println("k = $k")
      k++
      break@outerloop
    }
  }

  // 使う場面はあまりないかもしれませんが、
  // 一応知っておくと便利かもしれません。
}
