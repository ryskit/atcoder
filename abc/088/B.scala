package B088

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val N = scanner.nextInt
  val a = List.fill(N)(scanner.nextInt)
  println(solve(a))

  def solve(x: List[Int]): Int = {
    val (alice, bob) = x.sorted.reverse.zipWithIndex.foldLeft((0, 0)) {
      case ((a, b), (v, idx)) => {
        if (idx % 2 == 0) (a + v, b)
        else (a, b + v)
      }
    }
    alice - bob
  }
}
