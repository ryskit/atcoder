package abc208B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val p = sc.nextLong
  val (_, currencies) = (1 to 10).foldLeft(1L, Vector.empty[Long]) {
    case ((prev, acc), i) => (prev * i, acc :+ (prev * i))
  }

  val (ans, _) = currencies.reverse.foldLeft(0L, p) {
    case ((total, remaining), currency) =>
      val divide = remaining / currency
      if (divide > 0) {
        val d = math.min(divide, 100L)
        val mod = remaining % (currency * d)
        (total + d, mod)
      } else {
        (total, remaining)
      }
  }
  println(ans)
}
