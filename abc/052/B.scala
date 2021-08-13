package B052

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val n = scanner.nextInt
  val s = scanner.next
  val (answer, _) = s.toCharArray.foldLeft(0, 0) {
    case ((maxX, x), c) =>
      val currentX = if (c == 'I') x + 1 else x - 1
      (maxX.max(currentX), currentX)

  }
  println(answer)
}
