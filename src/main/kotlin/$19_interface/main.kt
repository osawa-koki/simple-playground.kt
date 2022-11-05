package `$18_interface`

fun main() {
  // インターフェースとは、
  // クラスが実装しなければならないメソッドの一覧を定義するものです。
  // インターフェースを実装するクラスは、
  // インターフェースで定義されているメソッドをすべて実装しなければなりません。
  // あるクラスが指定したメソッドを有することを保証するために、
  // インターフェースを使用します。
  // また、インターフェースを実装することで、
  // クラスの振る舞いを変更することができます。
  // 例えば、
  // テスト用のクラスを作成する場合は、
  // テスト用のクラスを作成し、
  // そのクラスがインターフェースを実装するようにします。
  // そして、
  // 本番用のクラスを作成する場合は、
  // 本番用のクラスを作成し、
  // そのクラスがインターフェースを実装するようにします。
  // これはインターフェースをデータ型として扱うことで実現します。

  val service: Service = Service()
  service.authenticate("userA", "passwordA")

  // また、インターフェースをデータ型として扱う場合には、
  // 以下のようになります。

  val service_mock: Authenticate = Service()
  service_mock.authenticate("userA", "passwordA")
  // このように、
  // インターフェースをデータ型として扱うことで、
  // インターフェースを実装するクラスのインスタンスを
  // 代入することができます。
  // インターフェースが実装されたクラスは、
  // インターフェースが要求しているメソッドをすべて実装しているため、
  // 代入されたインスタンスに対するメソッドを
  // コンパイル時にチェックすることができます。

  // また、クラスは複数のインターフェースを実装することができます。
}

interface Authenticate {
  fun authenticate(userName: String, password: String)
}

class Service : Authenticate {
  // サービクラスは認証クラスを実装しているため、
  // サービスクラスは認証インターフェースのメソッドをすべて実装している必要があります。
  // 具体的には認証インターフェースで定義されているauthenticateメソッドを実装する必要があります。
  override fun authenticate(userName: String, password: String) {
    println("userName: ${userName}")
    println("password: ${password}")
  }
}
