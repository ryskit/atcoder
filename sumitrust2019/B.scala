package sumitrust2019B

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val N = scanner.nextInt
  val X1 = (N / 1.08).ceil.toInt
  val X2 = (N / 1.08).floor.toInt
  val answer = List(X1, X2).find(n => (n * 1.08).floor.toInt == N)
  answer match {
    case Some(v) => println(v)
    case None    => println(":(")
  }
}
