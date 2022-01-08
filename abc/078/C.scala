package abc078C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextLong
  val times = 1900L * m + 100L * (n - m)
  println((1L << m) * times)
}
