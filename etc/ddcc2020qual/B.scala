package Bddcc2020qual

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val (as, aSum) = (1 to n).foldLeft(Vector.empty[Long], 0L) {
    case ((acc, sum), _) =>
      val x = sc.nextLong
      (acc :+ x, sum + x)
  }
  val (answer, _) =
    as.dropRight(1).foldLeft(Long.MaxValue, 0L) {
      case ((min, left), a) =>
        val currentLeft = left + a
        val currentRight = aSum - currentLeft
        val diff = math.abs(currentLeft - currentRight)
        (min.min(diff), currentLeft)
    }
  println(answer)
}
