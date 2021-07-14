package C156

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val N = scanner.nextInt
  val X = List.fill(N)(scanner.nextInt)
  val cost = (X.min to X.max).foldLeft(1000000000)({
    case (minCost, p) => {
      val currentCost = X.foldLeft(0)((acc, x) => {
        acc + (x - p) * (x - p)
      })
      Math.min(minCost, currentCost)
    }
  })
  println(cost)
}
