package C127

object Main extends App {
  val scanner = new java.util.Scanner(System.in)
  val n = scanner.nextInt
  val m = scanner.nextInt
  val lr = List.fill(m)((scanner.nextInt, scanner.nextInt))
  val answer = lr.foldLeft(1, n)({
    case ((min, max), (l, r)) =>
      val newMin = l.max(min)
      val newMax = r.min(max)
      (newMin, newMax)
  })
  println((answer._2 - answer._1 + 1).max(0))
}
