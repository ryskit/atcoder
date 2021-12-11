package abc131D

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val abs = (1 to n).foldLeft(Vector.empty[(Int, Int)]) {
    case (acc, i) =>
      val a, b = sc.nextInt
      acc :+ (a, b)
  }
  val absSorted = abs.sortBy(_._2)
  val (sumTimes, ans) = absSorted.foldLeft(0, true) {
    case ((times, res), (a, b)) =>
      if (res) {
        if (times + a <= b) {
          (times + a, res)
        } else {
          (times + a, false)
        }
      } else (times + a, false)
  }
  println(if (ans) "Yes" else "No")
}
