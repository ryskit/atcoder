package tessoku_book_B11

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val a = (0 until n)
    .foldLeft(Array.fill(n)(0)) { (acc, i) =>
      acc(i) = sc.nextInt
      acc
    }
    .sorted

  val q = sc.nextInt
  val sb = new collection.mutable.StringBuilder()
  (1 to q).foreach { _ =>
    val q = sc.nextInt
    sb.append(s"${search(q)}\n")
  }
  println(sb.toString())

  def search(x: Int): Int = {
    var r = n
    var l = -1
    while (r - l > 1) {
      val m = (l + r) / 2
      if (x <= a(m)) r = m
      else l = m
    }
    r
  }
}
