package agc017A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, p = sc.nextInt
  val as = Vector.fill(n)(sc.nextInt)
  val odd = as.count(_ % 2 == 1)

  val ans = if (odd == 0) {
    if (p == 0) math.pow(2, n).toLong
    else 0
  } else {
    Math.pow(2, n - 1).toLong
  }
  println(ans)
}
