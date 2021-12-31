package arc078A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val (as, sum) = (0 until n).foldLeft(Vector.empty[Long], 0L) {
    case ((acc, sum), i) =>
      val a = sc.nextLong
      (acc :+ a, sum + a)
  }
  val (_, diff) =
    (2 to n).foldLeft(0L, math.abs(as.head - (sum - as.head))) {
      case ((sunuke, diff), i) =>
        val currentSunuke = sunuke + as(i - 2)
        val currentAraiguma = sum - currentSunuke
        val currentDiff = math.abs(currentSunuke - currentAraiguma)
        (currentSunuke, diff.min(currentDiff))
    }
  println(diff)
}
