package B083

import java.util.Scanner

import scala.annotation.tailrec

object Main extends App {
  val sc = new Scanner(System.in)
  val N = sc.nextInt
  val A = sc.nextInt
  val B = sc.nextInt

  @tailrec
  def solve(n: Int, N: Int, A: Int, B: Int, Sum: Int): Int = {
    if (n <= N) {
      val eachSum = if (n < 10) n else n.toString.split("").map(_.toInt).sum
      if (A <= eachSum && eachSum <= B)
        solve(n + 1, N, A, B, Sum + n)
      else
        solve(n + 1, N, A, B, Sum)
    } else {
      Sum
    }
  }

  println(solve(1, N, A, B, 0))
}
