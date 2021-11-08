package abc210A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, a, x, y = sc.nextInt
  val m = math.max(0, n - a)
  val ans = (n - m) * x + (m * y)
  println(ans)
}
