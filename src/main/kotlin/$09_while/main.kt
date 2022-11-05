package `$09_while`

fun main() {
  // while文はほかの言語と同じです。

  var i = 0
  while (i < 10) {
    println("i = $i")
    i++
  }

  // do-while文はほかの言語と同じです。

  var j = 0
  do {
    println("j = $j")
    j++
  } while (j < 10)

  // while文とdo-while文の違いは、
  // while文は条件式がfalseの場合には、
  // 一度も処理が実行されないのに対し、
  // do-while文は条件式がfalseの場合でも、
  // 一度は処理が実行されるという点です。

  // while文とdo-while文は、
  // ほかの言語と同じように、
  // ラベルを付けることができます。

  outerloop@ for (i in 1..5) {
    println("i = $i")
    innerloop@ for (j in 1..5) {
      println("j = $j")
      if (j == 3) break@outerloop
    }
  }

  // このように、
  // ラベルを付けることで、
  // break文やcontinue文の対象を、
  // ラベルが付いたループに限定することができます。

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
