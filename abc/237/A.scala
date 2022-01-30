package abc237A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = BigInt(sc.nextLong)
  val low = BigInt(math.pow(-2, 31).toLong)
  val high = BigInt(math.pow(2, 31).toLong)
  val ans = if (low <= n && n < high) {
    "Yes"
  } else {
    "No"
  }
  println(ans)
}
