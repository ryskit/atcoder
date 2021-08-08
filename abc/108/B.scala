package B108

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val x1 = scanner.nextInt
  val y1 = scanner.nextInt
  val x2 = scanner.nextInt
  val y2 = scanner.nextInt
  val dx = x2 - x1
  val dy = y2 - y1
  printf("%d %d %d %d\n", x2 - dy, y2 + dx, x1 - dy, y1 + dx)
}
