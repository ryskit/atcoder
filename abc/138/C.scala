package C138

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val n = scanner.nextInt
  val vs = List.fill(n)(scanner.nextInt)
  val sortedVs = vs.sorted
  val answer = sortedVs.tail.foldLeft(sortedVs.head: Double)({
    case (acc, next) => (acc + next.toDouble) / 2
  })
  printf("%.5f\n", answer)
}
