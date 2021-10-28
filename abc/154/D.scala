package abc154D

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, k = sc.nextInt
  val (ps, es) = (1 to n).foldLeft(Vector.empty[Int], Vector.empty[Double]) {
    case ((ps, es), _) =>
      val p = sc.nextInt
      (ps :+ p, es :+ (1.0 + p) / 2.0)
  }
  val exp = (0 until k).foldLeft(0d) {
    case (sum, i) => sum + es(i)
  }
  val (answer, _) = (1 to n - k).foldLeft(exp, exp) {
    case ((max, prev), i) =>
      val prevValue = es(i - 1)
      val lastValue = es(i + k - 1)
      val currentSum = prev - prevValue + lastValue
      (max.max(currentSum), currentSum)
  }
  println(f"$answer%.10f")
}
