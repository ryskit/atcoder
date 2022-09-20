package tessoku_book_B07

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val t = sc.nextInt
  val n = sc.nextInt
  val a = Array.fill(t + 2)(0)
  (1 to n).foreach { i =>
    val l = sc.nextInt
    val r = sc.nextInt
    a(l) += 1
    a(r) -= 1
  }
  val sb = new collection.mutable.StringBuilder()
  (0 until t).foreach { i =>
    val result = a(i)
    sb.append(s"$result\n")
    a(i + 1) += result
  }
  println(sb.toString())
}
