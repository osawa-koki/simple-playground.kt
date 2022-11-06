package `$22_collection`

fun main() {
  // コレクションは、複数のデータをまとめて扱うためのものです。
  // コレクションは、リスト、セット、マップの3つの種類があります。

  // リストは、順序付けられたデータの集合です。
  // リストは、要素の追加、削除、変更が可能です。
  // リストは、要素の重複が可能です。
  // リストは、要素の順序が保持されます。
  // リストは、インデックスを指定して要素にアクセスできます。

  // セットは、重複しないデータの集合です。
  // セットは、要素の追加、削除、変更が可能です。
  // セットは、要素の重複が不可能です。
  // セットは、要素の順序が保持されません。
  // セットは、インデックスを指定して要素にアクセスできません。

  // マップは、キーと値のペアの集合です。
  // マップは、要素の追加、削除、変更が可能です。
  // マップは、要素の重複が不可能です。
  // マップは、要素の順序が保持されません。
  // マップは、キーを指定して値にアクセスできます。

  // ===== ===== ===== ===== =====

  // リストの作成

  // リストを作成するには、listOf関数を使用します。
  // listOf関数は、引数に指定した要素を持つリストを作成します。

  val list_immutable = listOf(1, 2, 3)
  // list_immutable[0] = 4 // コンパイルエラー
  println("list_immutable = $list_immutable")

  // 可変のリストを作成するには、mutableListOf関数を使用します。

  val list_mutable = mutableListOf(1, 2, 3)
  list_mutable[0] = 4
  println("list_mutable = $list_mutable")

  // ===== ===== ===== ===== =====

  // リストの要素の取得

  // リストの要素を取得するには、インデックスを指定してアクセスします。
  // インデックスは、0から始まります。

  val list = listOf(1, 2, 3)
  println("list[0] = ${list[0]}")
  println("list[1] = ${list[1]}")
  println("list[2] = ${list[2]}")

  // ===== ===== ===== ===== =====

  // リストの要素の追加

  // リストの要素を追加するには、+演算子を使用します。

  val list1 = listOf(1, 2, 3)
  val list2 = list1 + 4
  println("list1 = $list1")
  println("list2 = $list2")

  // ===== ===== ===== ===== =====

  // リストの要素の削除

  // リストの要素を削除するには、-演算子を使用します。

  val list3 = listOf(1, 2, 3)
  val list4 = list3 - 2
  println("list3 = $list3")
  println("list4 = $list4")

  // ===== ===== ===== ===== =====

  // リストの要素の変更

  // リストの要素を変更するには、to演算子を使用します。

  val list5 = listOf(1, 2, 3)
  val list6 = list5.map { if (it == 2) 4 else it }
  println("list5 = $list5")
  println("list6 = $list6")

  // ===== ===== ===== ===== =====

  // リストの要素の検索

  // リストの要素を検索するには、indexOf関数を使用します。

  val list7 = listOf(1, 2, 3)
  println("list7.indexOf(2) = ${list7.indexOf(2)}")

  // ===== ===== ===== ===== =====

  // リストの要素の存在確認

  // リストの要素が存在するかどうかを確認するには、contains関数を使用します。

  val list8 = listOf(1, 2, 3)
  println("list8.contains(2) = ${list8.contains(2)}")

  // ===== ===== ===== ===== =====

  // リストの要素の数の取得

  // リストの要素の数を取得するには、sizeプロパティを使用します。

  val list9 = listOf(1, 2, 3)
  println("list9.size = ${list9.size}")

  // ===== ===== ===== ===== =====

  // リストの要素の最大値の取得

  // リストの要素の最大値を取得するには、max関数を使用します。

  val list10 = listOf(1, 2, 3)
  println("list10.max() = ${list10.max()}")

  // ===== ===== ===== ===== =====

  // リストの要素の最小値の取得

  // リストの要素の最小値を取得するには、min関数を使用します。

  val list11 = listOf(1, 2, 3)
  println("list11.min() = ${list11.min()}")

  // ===== ===== ===== ===== =====

  // リストの要素の合計値の取得

  // リストの要素の合計値を取得するには、sum関数を使用します。

  val list12 = listOf(1, 2, 3)
  println("list12.sum() = ${list12.sum()}")

  // ===== ===== ===== ===== =====

  // リストの要素の平均値の取得

  // リストの要素の平均値を取得するには、average関数を使用します。

  val list13 = listOf(1, 2, 3)
  println("list13.average() = ${list13.average()}")

  // ===== ===== ===== ===== =====

  // リストの要素の結合

  // リストの要素を結合するには、joinToString関数を使用します。

  val list14 = listOf(1, 2, 3)
  println("list14.joinToString() = ${list14.joinToString()}")

  // ===== ===== ===== ===== =====

  // リストの要素の絞り込み

  // リストの要素を絞り込むには、filter関数を使用します。

  val list15 = listOf(1, 2, 3)
  val list16 = list15.filter { it % 2 == 0 }

  println("list15 = $list15")
  println("list16 = $list16")

  // ===== ===== ===== ===== =====

  // リストの要素の変換

  // リストの要素を変換するには、map関数を使用します。

  val list17 = listOf(1, 2, 3)
  val list18 = list17.map { it * 2 }

  println("list17 = $list17")
  println("list18 = $list18")

  // ===== ===== ===== ===== =====

  // リストの要素の並び替え

  // リストの要素を並び替えるには、sorted関数を使用します。

  val list19 = listOf(3, 2, 1)
  val list20 = list19.sorted()

  println("list19 = $list19")
  println("list20 = $list20")

  // ===== ===== ===== ===== =====

  // リストの要素の逆順

  // リストの要素を逆順にするには、reversed関数を使用します。

  val list21 = listOf(1, 2, 3)
  val list22 = list21.reversed()

  println("list21 = $list21")
  println("list22 = $list22")

  // ===== ===== ===== ===== =====

  // リストの要素のランダム並び替え

  // リストの要素をランダムに並び替えるには、shuffled関数を使用します。

  val list23 = listOf(1, 2, 3)
  val list24 = list23.shuffled()

  println("list23 = $list23")
  println("list24 = $list24")

  // ===== ===== ===== ===== =====

  // リストの要素の重複削除

  // リストの要素の重複を削除するには、distinct関数を使用します。

  val list25 = listOf(1, 2, 3, 1, 2, 3)
  val list26 = list25.distinct()

  println("list25 = $list25")
  println("list26 = $list26")

  // ===== ===== ===== ===== =====

  // リストの要素の結合

  // リストの要素を結合するには、plus関数を使用します。

  val list27 = listOf(1, 2, 3)
  val list28 = listOf(4, 5, 6)
  val list29 = list27 + list28

  println("list27 = $list27")
  println("list28 = $list28")
  println("list29 = $list29")

  // ===== ===== ===== ===== =====
  // ===== ===== ===== ===== =====
  // ===== ===== ===== ===== =====

  // マップ

  // マップは、キーと値のペアを要素として持つコレクションです。
  // リストがインデックス番号で要素を管理するのに対し、マップはキーで要素を管理します。

  // マップの生成

  // マップを生成するには、mapOf関数を使用します。

  val map1 = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
  println("map1 = $map1")

  // ===== ===== ===== ===== =====

  // マップの要素の取得

  // マップの要素を取得するには、キーを指定して要素を取得します。

  val map2 = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
  println("map2[\"key1\"] = ${map2["key1"]}")

  // ===== ===== ===== ===== =====

  // マップの要素の存在確認

  // マップの要素が存在するか確認するには、contains関数を使用します。

  val map3 = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
  println("map3.contains(\"key1\") = ${map3.contains("key1")}")

  // ===== ===== ===== ===== =====

  // マップの要素の数

  // マップの要素の数を取得するには、sizeプロパティを使用します。

  val map4 = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
  println("map4.size = ${map4.size}")

  // ===== ===== ===== ===== =====

  // マップの要素の追加

  // マップの要素を追加するには、to関数を使用します。
  // 既に指定したキーが存在する場合は、値が上書きされます。

  val map5 = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
  val map6 = map5 + ("key4" to 4)

  println("map5 = $map5")
  println("map6 = $map6")

  // ===== ===== ===== ===== =====

  // マップの要素の削除

  // マップの要素を削除するには、minus関数を使用します。

  val map7 = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
  val map8 = map7 - "key1"

  println("map7 = $map7")

  // ===== ===== ===== ===== =====

  // マップの要素の更新

  // マップの要素を更新するには、to関数を使用します。
  // 指定したキーが存在しない場合は、新しい要素が追加されます。

  val map9 = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
  val map10 = map9 + ("key1" to 4)

  println("map9 = $map9")

  // ===== ===== ===== ===== =====

  // マップの要素の全削除

  // マップの要素を全削除するには、emptyMap関数を使用します。

  val map11 = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
  val map12 = emptyMap<String, Int>()

  println("map11 = $map11")
  println("map12 = $map12")

  // ===== ===== ===== ===== =====

  // マップの要素の全取得

  // マップの要素を全取得するには、keysプロパティを使用します。

  val map13 = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
  val keys = map13.keys

  println("map13 = $map13")
  println("keys = $keys")

  // ===== ===== ===== ===== =====
  // ===== ===== ===== ===== =====
  // ===== ===== ===== ===== =====

  // セット

  // セットは、重複する要素を持たないコレクションです。
  // リストとマップとは異なり、要素の順序は保証されません。

  // セットの生成

  // セットを生成するには、setOf関数を使用します。

  val set1 = setOf(1, 2, 3)
  println("set1 = $set1")

  // ===== ===== ===== ===== =====

  // セットの要素の存在確認

  // セットの要素が存在するか確認するには、contains関数を使用します。

  val set2 = setOf(1, 2, 3)
  println("set2.contains(1) = ${set2.contains(1)}")

  // ===== ===== ===== ===== =====

  // セットの要素の数

  // セットの要素の数を取得するには、sizeプロパティを使用します。

  val set3 = setOf(1, 2, 3)
  println("set3.size = ${set3.size}")

  // ===== ===== ===== ===== =====

  // セットの要素の追加

  // セットの要素を追加するには、plus関数を使用します。
  // 既に指定した要素が存在する場合は、何も起こりません。

  val set4 = setOf(1, 2, 3)
  val set5 = set4 + 4

  println("set4 = $set4")
  println("set5 = $set5")

  // ===== ===== ===== ===== =====

  // セットの要素の削除

  // セットの要素を削除するには、minus関数を使用します。

  val set6 = setOf(1, 2, 3)
  val set7 = set6 - 1

  println("set6 = $set6")
  println("set7 = $set7")

  // ===== ===== ===== ===== =====

  // セットの要素の全削除

  // セットの要素を全削除するには、emptySet関数を使用します。

  val set8 = setOf(1, 2, 3)
  val set9 = emptySet<Int>()

  println("set8 = $set8")
  println("set9 = $set9")

  // ===== ===== ===== ===== =====

  // セットの要素の全取得

  // セットの要素を全取得するには、toList関数を使用します。

  val set10 = setOf(1, 2, 3)
  val set_list = set10.toList()

  println("set10 = $set10")
  println("set_list = $set_list")

  // ===== ===== ===== ===== =====

  // リストのセット化

  // リストをセットに変換するには、toSet関数を使用します。

  val set11 = listOf(1, 2, 3, 1, 2, 3).toSet()
  println("set11 = $set11")
  
}

