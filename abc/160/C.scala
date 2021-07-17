package C160

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val K = scanner.nextInt
  val N = scanner.nextInt
  val A = List.fill(N)(scanner.nextInt)
  val max = A
    .zip(A.tail :+ K + A.head)
    .foldLeft(0)({
      case (max, (current, next)) => (next - current).max(max)
    })
  val answer = K - max
  println(answer)
}
