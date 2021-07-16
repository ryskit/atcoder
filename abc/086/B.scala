package B086

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val a = scanner.next
  val b = scanner.next
  val ab = a + b
  val abDouble = ab.toDouble
  val x = math.sqrt(abDouble).floor
  if (x * x == abDouble) println("Yes") else println("No")
}
