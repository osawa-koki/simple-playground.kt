package `$20_nullable_nunnullable`

fun main() {
  // Kotlinにはnull安全を確保するため、
  // ナル許容型とナル不許容型があります。
  // これらのデータ型は、
  // ナル許容型は、データ型の後に「?」を付けることで、
  // nullを許容することができます。
  // 一方、ナル不許容型は、データ型の後に「!!」を付けることで、
  // nullでないことを確認することができます。
  // また、ナル許容型は、データ型の後に「?:」を付けることで、
  // nullの場合に、デフォルト値を設定することができます。

  // これらの区別があるのは、ナル参照という、
  // プログラマを悩ませ続けた問題を解決するためです。
  // nullの考案者であるTony Hoareは、
  // nullの発明に関して「10億ドル」の誤りであったと述べています。

  // まず、nullの問題点を見ていきましょう。

  var _name_nonnullable: String = "Kotlin"
  println("_name_nonnullable: ${_name_nonnullable.length}")

  // これは問題ありませんが、

  var _name_nullable: String? = null
  // println("_name_nullable: ${_name_nullable!!.length}") // エラー
  // -> java.lang.NullPointerException

  // 「!!」によってnull許容型をnull非許容型に変換していますが、
  // 問題は、この後にnullに対して参照を行っているため、
  // NullPointerExceptionが発生しています。

  // ================================

  // null許容型のメンバに対するアクセスは「?」を使用することで、nullの場合に例外を発生させずに、
  // nullを返すことができます。

  println("_name_nullable?.length: ${_name_nullable?.length}")

  // また、null許容型のメンバに対するアクセスは「?:」を使用することで、nullの場合にデフォルト値を返すことができます。
  // これはエルビス演算子と呼ばれています。

  println("_name_nullable?.length: ${_name_nullable?.length ?: 0}")

  // null許容型の中身がnullでない場合に、
  // null許容型のメンバに対するアクセスは「!!」を使用することで、
  // nullでないことを確認することができます。

  println("_name_nullable?.length: ${_name_nonnullable!!.length}")

  // 上記手法は、null参照を防ぐための仕組みを回避しているため、
  // 原則として使用するべきではありません。

  // ================================

  // 代わりに「?.run」を使用することで、指定した値がnullでない場合に、
  // 指定した処理を実行することができます。

  _name_nullable?.run {
    println("run (nullable): ${length}")
  }

  _name_nonnullable?.run {
    println("run (nonnullale): ${length}")
  }
}

