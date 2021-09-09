package B113

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, t, a = sc.nextInt
  val hs = Seq.fill(n)(sc.nextInt)

  val (_, answer) = hs.zipWithIndex.foldLeft(Double.MaxValue, 0) {
    case ((apx, number), (h, idx)) =>
      val temp = t - (h * 0.006)
      val (diffCurrent, diffApx) = (math.abs(a - temp), math.abs(a - apx))
      if (diffCurrent < diffApx) {
        (temp, idx)
      } else {
        (apx, number)
      }
  }
  println(answer + 1)
}
