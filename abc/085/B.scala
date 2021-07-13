package B085

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val N = scanner.nextInt
  val d = List.fill(N)(scanner.nextInt)
  println(solve(d))

  def solve(dn: List[Int]): Int = {
    val (s, _) = dn.sorted.reverse.foldLeft((0, 10000)) {
      case ((stack, before), v) => {
        if (before > v) (stack + 1, v) else (stack, before)
      }
    }
    s
  }
}
