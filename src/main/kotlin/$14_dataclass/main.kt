package `$14_dataclass`

fun main() {
  // データクラスとはクラスの一種で、
  // データを保持するクラスのことです。
  // classの前にdataを付けることで作成できます。
  // データクラスの利点として以下の2つがあげられます。
  // 1. 出力時のフォーマットが自動で定義される
  // 2. データの比較が自動で定義される

  // 1. 出力時のフォーマットが自動で定義される
  // 以下のように出力すると、
  // データクラスの名前と、
  // データクラスのプロパティの名前と値が出力されます。
  val dataClass1 = DataClass1("dataClass1", 1)
  println(dataClass1)
  // -> DataClass1(name=dataClass1, number=1)

  // ちなみに、通常のクラスでは以下のように出力されます。
  val normalClass1 = NormalClass1("normalClass1", 1)
  println(normalClass1)
  // -> $14_dataclass.NormalClass1@7f31245a
  // これはシンボル情報等の余計な情報が出力されるため、美しくないです。

  // 2. データの比較が自動で定義される
  // データクラスのインスタンス同士を比較すると、
  // プロパティの値が全て同じであればtrueを返します。
  val dataclass_compare1: DataClass1 = DataClass1("dataClass1", 1)
  val dataclass_compare2: DataClass1 = DataClass1("dataClass1", 1)
  println("dataclass_compare1 == dataclass_compare2: ${dataclass_compare1 == dataclass_compare2}")

  // 通常のクラスのインスタンス同士を比較すると、
  // プロパティの値が全て同じであってもfalseを返します。
  // これは、通常のクラスはプロパティの値が全て同じであっても、
  // インスタンスが異なる場合があるためです。
  val normalclass_compare1: NormalClass1 = NormalClass1("normalClass1", 1)
  val normalclass_compare2: NormalClass1 = NormalClass1("normalClass1", 1)
  println("normalclass_compare1 == normalclass_compare2: ${normalclass_compare1 == normalclass_compare2}")

  // ちなみに、データクラスのインスタンスをコピーするときは、
  // copyメソッドを使います。
  val dataclass_copy1: DataClass1 = DataClass1("dataClass1", 1)
  val dataclass_copy2: DataClass1 = dataclass_copy1.copy()
  println("dataclass_copy1 == dataclass_copy2: ${dataclass_copy1 == dataclass_copy2}")

  // 通常のクラスのインスタンスをコピーするときは、
  // コンストラクタを使います。
  val normalclass_copy1: NormalClass1 = NormalClass1("normalClass1", 1)
  val normalclass_copy2: NormalClass1 = NormalClass1(normalclass_copy1.name, normalclass_copy1.number)
  println("normalclass_copy1 == normalclass_copy2: ${normalclass_copy1 == normalclass_copy2}")
  // この方法では当然ですが、コンストラクタが実行されて、
  // インスタンスが新しく生成されるため、
  // 両者を比較してもfalseになります。
}

// データクラスの定義
data class DataClass1(
  val name: String,
  val number: Int
)

// 通常のクラスの定義
class NormalClass1(
  val name: String,
  val number: Int
)
