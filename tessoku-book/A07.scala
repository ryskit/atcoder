package tessoku_book_A07

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val d = sc.nextInt
  val n = sc.nextInt
  val s = Array.fill(d + 2)(0)
  val ans = Array.fill(d + 2)(0)
  (1 to n).foreach { i =>
    val l = sc.nextInt
    val r = sc.nextInt
    s(l) += 1
    s(r + 1) -= 1
  }
  val sb = new collection.mutable.StringBuilder
  (1 to d).foreach { d =>
    val v = s(d - 1) + s(d)
    sb.append(s"$v\n")
    s(d) = v
  }
  println(sb.toString())
}
