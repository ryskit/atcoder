package B087

import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val A = sc.nextInt
  val B = sc.nextInt
  val C = sc.nextInt
  val X = sc.nextInt
  println(solve(A, B, C, X))

  def solve(A: Int, B: Int, C: Int, X: Int): Int = {
    val answer = for {
      a <- 0 to A
      b <- 0 to B
      c <- 0 to C
      total = 500 * a + 100 * b + 50 * c
      if X == total
    } yield (a, b, c)
    answer.size
  }
}
