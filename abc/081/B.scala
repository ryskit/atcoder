package B081

import java.util.Scanner

import scala.annotation.tailrec

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val as = (1 to n).map(_ => sc.nextInt)

  @tailrec
  def solve(as: Seq[Int], count: Int): Int = {
    if (as.forall(_ % 2 == 0)) {
      solve(as.map(_ / 2), count + 1)
    } else {
      count
    }
  }
  println(solve(as, 0))
}
