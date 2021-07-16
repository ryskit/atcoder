package B074

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val N = scanner.nextInt
  val K = scanner.nextInt
  val xs = List.fill(N)(scanner.nextInt)
  val answer = xs.foldLeft(0)({
    case (acc, x) => {
      val A = 0
      val B = K
      val aCost = x - A
      val bCost = (x - B).abs
      acc + (math.min(aCost, bCost) * 2)
    }
  })
  println(answer)
}
