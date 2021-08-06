package B158

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val n = scanner.nextLong
  val a = scanner.nextLong
  val b = scanner.nextLong
  val ab = a + b
  val d = n / ab
  val r = n % ab
  val ra = if (r - a > 0) a else r
  println(a * d + ra)
}
