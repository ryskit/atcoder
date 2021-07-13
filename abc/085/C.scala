package C085

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val N = scanner.nextInt
  val Y = scanner.nextInt / 1000
  val (a, b, c) = solve(N, Y)
  println(s"$a $b $c")

  def solve(n: Int, total: Int): (Int, Int, Int) = {
    val answer = for {
      x <- 0 to n
      nx = n - x
      y <- 0 to nx
      z = nx - y
      if 10 * x + y * 5 + z == total
    } yield (x, y, z)
    answer.headOption.getOrElse((-1, -1, -1))
  }

}
