package arc069C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextLong
  val ans = if (n * 2 <= m) {
    val r = m - n * 2
    n + (r / 4)
  } else {
    m / 2
  }
  println(ans)
}
