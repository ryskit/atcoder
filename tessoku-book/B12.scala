package tessoku_book_B12

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt

  var l = 0.toDouble
  var r = 100.toDouble
  val ans = (0 until 100).foldLeft(0.toDouble) { (ans, _) =>
    val m = (l + r) / 2.0
    val v = f(m)
    if (v > 1.0 * n) {
      r = m
      m
    } else {
      l = m
      m
    }
  }

  println(f"$ans%.12f")

  def f(x: Double): Double =
    x * x * x + x

}
