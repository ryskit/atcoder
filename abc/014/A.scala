package A014

import java.util.Scanner

import scala.annotation.tailrec

object Main extends App {
  val scanner = new Scanner(System.in)
  val A = scanner.nextLong
  val B = scanner.nextLong
  val C = scanner.nextLong
  println(divide((A, B, C), 0))

  @tailrec
  def divide(x: (Long, Long, Long), acc: Int): Int = {
    x match {
      case (a, b, c) if a == b && b == c => if (a % 2 == 0) -1 else 0
      case (a, b, c) if a % 2 == 0 && b % 2 == 0 && c % 2 == 0 =>
        divide(((b + c) / 2, (a + c) / 2, (a + b) / 2), acc + 1)
      case _ => acc
    }
  }
}
