package agc028A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextLong
  val s, t = sc.next
  val g = gcm(n, m)
  val ans = lcm(n, m)
  val newS = s.zipWithIndex.filter(_._2 % (n / g) == 0).map(_._1).mkString
  val newT = t.zipWithIndex.filter(_._2 % (m / g) == 0).map(_._1).mkString
  println(if (newS == newT) ans else -1)

  def gcm(x: Long, y: Long): Long = {
    if (y == 0) x
    else gcm(y, x % y)
  }

  def lcm(x: Long, y: Long): Long = {
    (x * y) / gcm(x, y)
  }
}
