package abc223C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val (abs, sumTime) =
    (1 to n).foldLeft(Vector.empty[(Double, Double, Double)], 0d) {
      case ((acc, sumTime), _) =>
        val a = sc.nextDouble
        val b = sc.nextDouble
        val c = a / b
        (acc :+ (a, b, c), sumTime + c)
    }
  val time = sumTime / 2
  val (answer, _, _) = abs.foldLeft(0d, time, false) {
    case ((sum, limitTime, skip), (a, b, c)) =>
      if (!skip) {
        if (c <= limitTime) {
          (sum + a, limitTime - c, skip)
        } else {
          if (0.00001 <= limitTime) {
            val add = b * limitTime
            (sum + add, 0, true)
          } else {
            (sum, 0, true)
          }
        }
      } else {
        (sum, limitTime, skip)
      }

  }
  println(answer)
}
