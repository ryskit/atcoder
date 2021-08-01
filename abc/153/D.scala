package D153

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val h = scanner.nextLong

  def solve(i: Long): LazyList[Long] =
    i #:: solve(2L * i)

  val answer = solve(1).takeWhile(_ <= h).sum
  println(answer)
}
