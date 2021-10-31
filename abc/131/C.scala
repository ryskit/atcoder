package abc131C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, c, d = sc.nextLong
  val lc = lcm(c, d)
  val total = b / c + b / d - b / lc
  val part = a / c + a / d - a / lc
  val answer = b - a - (total - part) + (if (a % c != 0 && a % d != 0) 1 else 0)
  println(answer)

  def lcm(x: Long, y: Long): Long = {
    (x * y) / gcm(x, y)
  }

  def gcm(x: Long, y: Long): Long = {
    if (y == 0) x
    else gcm(y, x % y)
  }
}
