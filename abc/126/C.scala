package abc126C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, k = sc.nextInt
  val maxDenominator = n * math.pow(2, calcMultiple(1))
  val numerator = (1 to n).foldLeft(0d) {
    case (sum, i) =>
      val numer = (n.toLong * math.pow(2, calcMultiple(i)))
      sum + (maxDenominator / numer)
  }

  val answer = BigDecimal(numerator) / BigDecimal(maxDenominator)
  println(f"$answer%.10f")

  @scala.annotation.tailrec
  def calcMultiple(x: Long, sum: Int = 0): Long = {
    if (x < k) calcMultiple(x * 2, sum + 1)
    else sum
  }
}
