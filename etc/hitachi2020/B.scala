package hitachi2020B

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val a = scanner.nextInt
  val b = scanner.nextInt
  val m = scanner.nextInt
  val as = Array.fill(a)(scanner.nextInt)
  val bs = Array.fill(b)(scanner.nextInt)
  val xyc = Array.fill(m)(Array.fill(3)(scanner.nextInt))
  val abMin = as.min + bs.min
  val answer = xyc.foldLeft(abMin)({
    case (min, Array(x, y, c)) =>
      val aCost = as(x - 1)
      val bCost = bs(y - 1)
      val cost = aCost + bCost - c
      if (min > cost) cost else min
  })
  println(answer)
}
