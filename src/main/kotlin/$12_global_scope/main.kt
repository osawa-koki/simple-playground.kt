package `$12_global_scope`

// Javaと異なり、Kotlinでは、関数や変数はクラスに属する必要がありません。
// そのため、Kotlinでは、グローバルスコープという概念があります。
// これは、Javaのstaticメンバーと同じようなものです。
// ただし、staticメンバーは、クラスに属しているのに対し、
// Kotlinのグローバルスコープは、クラスに属していません。
// そのため、Kotlinのグローバルスコープは、クラスに属していないので、
// クラスのインスタンスを生成することなく、直接呼び出すことができます。

// グローバルスコープの変数・関数を定義します。

val globalVal = 100
fun globalFunc() = 200

// 同じパッケージ内のファイルから、グローバルスコープの変数・関数を呼び出します。
// 「caller.kt」ファイルに呼び出すコードを記述しています。
// そのファイルがmain関数を有し、エントリーポイントとなっているため、それを実行します。
// このファイルでは、定義したグローバルスコープの変数と関数が呼び出せることを確認します。

// このように、同じパッケージ内のファイルから、グローバルスコープの変数・関数を呼び出すことができます。

// しかしながら、別パッケージのファイルから、グローバルスコープの変数・関数を呼び出すことはできません。
// これは、Javaのstaticメンバーとは異なります。
// Javaのstaticメンバーは、別パッケージのファイルからも呼び出すことができます。