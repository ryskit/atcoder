package tessoku_book_A06

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val q = sc.nextInt
  val a = Array.fill(10002)(0)
  (1 to n).foreach { i =>
    if (i == 1) a(i) = sc.nextInt
    else a(i) = sc.nextInt + a(i - 1)
  }
  val sb = new collection.mutable.StringBuilder
  (1 to q).foreach { i =>
    val l = sc.nextInt
    val r = sc.nextInt
    sb.append(s"${a(r) - a(l - 1)}\n")
  }
  println(sb.toString())
}
