package abc238C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextLong
  val nLen = n.toString.toSeq.length
  val MOD = 998244353
  val ans = (1 to nLen).foldLeft(BigInt(0L)) {
    case (sum, i) =>
      val min = if (i == 1) 1L else math.pow(10, i - 1).toLong
      val max = math.min(n, ("9" * i).toLong)
      val calcCount = f(max)
      val half = calcCount / 2
      val isOdd = calcCount % 2 == 1
      val fsum = f(min) + f(max)
      var tmpSum = fsum * half
      if (isOdd) {
        tmpSum += f(min + half)
      }
      sum + tmpSum
  }

  println(ans % MOD)

  def f(x: BigInt): BigInt = {
    if (1 <= x && x <= 9) x
    else {
      val k = x.toString.length
      val divider = math.pow(10, k - 1).toLong
      var count = BigInt(0L)
      if (x / divider - 1 > 0) {
        count += (x / divider - 1) * divider
      }
      count += (x % divider + 1)
      count
    }
  }
}
