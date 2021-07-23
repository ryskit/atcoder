package B094

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val n = scanner.nextInt
  val m = scanner.nextInt
  val x = scanner.nextInt
  val as = List.fill(m)(scanner.nextInt)
  val costs = (0 to n).map({ v =>
    if (as.contains(v)) 1
    else 0
  })
  val (first, second) = costs.splitAt(x)
  val firstSum = first.sum
  val secondSum = second.sum
  println(firstSum.min(secondSum))
}
