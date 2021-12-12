package arc093C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextInt)
  val (total, _) = (as :+ 0).foldLeft(0L, 0) {
    case ((sum, prev), a) =>
      val diff = math.abs(a - prev)
      (sum + diff, a)
  }

  val ans = (0 until n).foldLeft(Vector.empty[Long]) {
    case (acc, i) =>
      val prev = if (as.isDefinedAt(i - 1)) as(i - 1) else 0
      val del = as(i)
      val next = if (as.isDefinedAt(i + 1)) as(i + 1) else 0
      val minusDiff1 = math.abs(del - prev)
      val minusDiff2 = math.abs(next - del)
      val plusDiff = math.abs(next - prev)
      acc :+ (total - minusDiff1 - minusDiff2 + plusDiff)
  }
  print(ans.mkString("\n"))
}
