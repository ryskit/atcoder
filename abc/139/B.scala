package B139

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val A = scanner.nextInt
  val B = scanner.nextInt
  println(solve(A, B))

  def solve(a: Int, b: Int): Int = {
    var socket = 1
    var tap = 0
    while (socket < b) {
      socket = socket + a - 1
      tap += 1
    }
    tap
  }

}
