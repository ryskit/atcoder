package abc123C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, a, b, c, d, e = sc.nextLong
  val min = Seq(a, b, c, d, e).min
  println((n + min - 1) / min + 4)
}
