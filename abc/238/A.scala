package abc238A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextLong

  val ans = if (math.pow(2, n).toLong > n * n) "Yes" else "No"
  println(ans)
}
